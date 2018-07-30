package top.imissqin.sso.service;

import top.imissqin.core.vo.PageVo;
import top.imissqin.core.vo.ResultVo;
import top.imissqin.domain.User;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserService {

    ResultVo save(User user);

    List<User> queryAll();

    PageVo<User> queryPage(int page, int count);

    /*登录查询*/
    User queryLogin(String name);

    /*登录和检查*/
    ResultVo ssoLogin(String token, String name, String password);

    /*单点登录之登录*/
    ResultVo ssoLogin(String name, String password);

    /*单点登录之检查是否登录*/
    ResultVo ssoCheck(String token);

    /*退出登录*/
    ResultVo loginOut(String token);

}
