package top.imissqin.mapper.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import top.imissqin.domain.LoginLog;

import java.util.List;

public interface LoginLogMapper {

    @Insert("insert into t_loginlog(lolog_ip, lolog_createtime, lolog_msg, uid) values(#{lolog_ip},#{lolog_createtime},#{lolog_msg}, #{lolog_uid})")
    int insert(LoginLog record);

    @Select("select lolog_id, lolog_ip, lolog_createtime, lolog_msg, uid from t_loginlog where id = #{lolog_id}")
    @ResultType(LoginLog.class)
    LoginLog selectById(Integer id);

    @Select("select lolog_id, lolog_ip, lolog_createtime, lolog_msg, uid from t_loginlog")
    @ResultType(LoginLog.class)
    List<LoginLog> selctAll();
}