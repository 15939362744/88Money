package top.imissqin.mapper.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import top.imissqin.domain.User;

import java.util.List;

public interface UserMapper {

    /*新增用户*/
    @Insert("insert into t_user(user_no, user_password, user_phone, user_uid, user_role, status) values(#{user_no}, #{user_password}, #{user_phone}, #{user_uid}, 1, 1)")
    int insert(User user);
    /*查询所有*/
    @Select("select user_id, user_no, user_password, user_phone, user_uid from t_user where status = 1")
    @ResultType(User.class)
    List<User> queryAll();
    /*查询分页*/
    @Select("select user_id, user_no, user_phone, user_uid, user_role from t_user where status = 1 and limit #{rowindex}, #{count}")
    @ResultType(User.class)
    List<User> queryPage(@Param("rowindex")int rowindex, @Param("count")int count);
    /*查询用户数量*/
    @Select("select count(*) from t_user where status = 1")
    @ResultType(User.class)
    Long queryCount();
    /*登录查询*/
    @Select("select user_id, user_no, user_password, user_phone, user_uid from t_user where user_no=#{name} or user_phone=#{name}")
    @ResultType(User.class)
    User queryLogin(String name);
}
