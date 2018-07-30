package top.imissqin.sso.provider;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.imissqin.core.redis.JedisUtil;
import top.imissqin.core.util.CookieUtil;
import top.imissqin.core.util.ExcuteUtil;
import top.imissqin.core.util.IdGenerator;
import top.imissqin.core.vo.PageVo;
import top.imissqin.core.vo.ResultVo;
import top.imissqin.domain.User;
import top.imissqin.mapper.user.UserMapper;
import top.imissqin.sso.service.UserService;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Service
public class UserProvider implements UserService {

    @Autowired
    private UserMapper mapper;
    @Autowired
    private IdGenerator idGenerator;
    @Autowired
    private JedisUtil jedisUtil;


    public ResultVo save(User user) {
        return ExcuteUtil.getResultVo(mapper.insert(user), "新增用户");
    }

    @Override
    public List<User> queryAll() {
        return mapper.queryAll();
    }

    public PageVo<User> queryPage(int page, int count) {
        PageVo<User> pageVo = new PageVo<User>();
        int index = 0;
        if (page > 0) {
            index = (page - 1) * count;
        }
        List<User> users = mapper.queryPage(index, count);
        if (users != null) {
            pageVo.setCode(0);
            pageVo.setCount(mapper.queryCount().intValue());
            pageVo.setMsg("");
            pageVo.setData(users);
        } else {
            pageVo.setCode(1);
            pageVo.setCount(0);
            pageVo.setData(new ArrayList<User>());
            pageVo.setMsg("暂无数据");
        }
        return pageVo;
    }

    @Override
    public User queryLogin(String name) {
        User user = mapper.queryLogin(name);
        return user;
    }

    /*完整的单点登录--->有session*/
    @Override
    public ResultVo ssoLogin(String token, String name, String password) {
        //第一次登录
        if (token.length() == 0) {
            //说明第一次登录
            User user = queryLogin(name);
            if (user != null) {
                //说明用户存在 开始校验密码
                if (Objects.equals(password,user.getUser_password())) {
                    //登录成功 生成唯一令牌
                    long tk = idGenerator.nextId();
                    //令牌存储到redis key:usertoken+令牌值 value:登录用户信息的json
                    jedisUtil.addStr("usertocken" + tk,JSON.toJSONString(user));
                    //设置有效期 默认30分钟
                    jedisUtil.expire("usertoken" + tk, TimeUnit.MINUTES, 30);
                    //返回结果
                    return new ResultVo(0,tk+"",user);
                } else {
                    //密码不正确
                    return ResultVo.setError("密码不正确");
                }

            } else {
                //用户名不存在
                return ResultVo.setError("用户名不存在");
            }
        } else {
            //已经登录过，生成过令牌了，需要验证令牌有效性
            String json = jedisUtil.getStr("usertoken:" + token);
            if (!StringUtils.isEmpty(json)) {
                //令牌有效 返回
                return new ResultVo(0,"登陆成功",JSON.parseObject(json,User.class ));
            } else {
                return ResultVo.setError("令牌失效，需重新登录");
            }
        }
    }

    /*单点登录*/
    @Override
    public ResultVo ssoLogin(String name, String password) {
        //第一次登录
        User user = mapper.queryLogin(name);
        System.out.println("---------------" + password + user+name);
        if (user != null) {
            if (Objects.equals(password,user.getUser_password())) {
                //登录成功 生成唯一令牌
                System.out.println("---------------" + password + user.getUser_password());
                long tk = idGenerator.nextId();
                System.out.println("-------" + tk);
                //把令牌存入redis
                jedisUtil.addStr("usertoken:" + tk, JSON.toJSONString(user));
                //设置有效时间
                jedisUtil.expire("usertoken:" + tk, TimeUnit.MINUTES, 30);

                return new ResultVo(0, tk +"", user);
            } else {
                return ResultVo.setError("密码错误！");
            }
        } else {
            return ResultVo.setError("用户名不存在");
        }
    }
    /*校验用户登录状态*/
    @Override
    public ResultVo ssoCheck(String token) {
        if (jedisUtil.isKey("usertoken:" + token)) {
            //存在就刷新时间
            jedisUtil.expire("usertoken:" + token, TimeUnit.MINUTES, 30);
            return ResultVo.setOK("存在");
        } else {

            return ResultVo.setError("不存在");
        }

    }
//注销登录
    @Override
    public ResultVo loginOut(String token) {
        //移除Redis
        jedisUtil.delKey("usertoken:" + token);
        return ResultVo.setOK("注销成功");
    }
}
