package top.imissqin.sso.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.imissqin.core.util.CookieUtil;
import top.imissqin.core.vo.PageVo;
import top.imissqin.core.vo.ResultVo;
import top.imissqin.domain.User;
import top.imissqin.sso.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
public class UserController {

    //创建日志对象
    private Logger logger =  LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService service;
    //注册
    @PostMapping("/useradd")
    public ResultVo add( User user) {
        logger.info("新增用户：" + user);
        return service.save(user);
    }
    //查询全部
    @GetMapping("/users")
    public List<User> qureyAll(){
        return service.queryAll();
    }
    //查询分页
    @GetMapping("/userpage")
    public PageVo query(int page, int limit) {
        return service.queryPage(page, limit);
    }
    //登录
    @PostMapping("/userlogin")
    public ResultVo login(String name, String password, HttpServletResponse response) {
        ResultVo resultVo = service.ssoLogin(name, password);
        if (resultVo.getCode() == 0) {
            CookieUtil.setCK("userauth", resultVo.getMsg(), -1, response);
            resultVo.setMsg("ok");
        }
        return resultVo;
    }
    //检查登录
    @GetMapping("/usercheck")
    public ResultVo checkLogin(HttpServletRequest request, HttpServletResponse response) {

        String ck = CookieUtil.getCk("userauth", request);
        ResultVo resultVo = service.ssoCheck(ck);
        if (resultVo.getCode() == 1) {
            //令牌失效 删除Cookie
            CookieUtil.delCK("userauth", response);
        }
        return resultVo;
    }
    //注销登录
    @GetMapping("/loginout")
    public ResultVo loginout(HttpServletResponse response, HttpServletRequest request) {
        String ck = CookieUtil.getCk("userauth", request);
        //删除cookie
        CookieUtil.setCK("userauth", ck + "", 0,response);
        return service.loginOut(ck);
    }

}
