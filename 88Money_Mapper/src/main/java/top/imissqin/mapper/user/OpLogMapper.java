package top.imissqin.mapper.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import top.imissqin.domain.LoginLog;
import top.imissqin.domain.OpLog;

import java.util.List;

public interface OpLogMapper {

    @Select("select oplog_id, oplog_createtime, oplog_msg, oplog_type, uid from t_oplog where oplog_id=#{oplog_id}")
    @ResultType(LoginLog.class)
    List<OpLog> selectByTypey(Integer type);

}