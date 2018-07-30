package top.imissqin.mapper.user;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.imissqin.domain.user.OpLog;
import top.imissqin.domain.user.OpLogExample;

public interface OpLogMapper {
    long countByExample(OpLogExample example);

    int deleteByExample(OpLogExample example);

    int deleteByPrimaryKey(Integer oplogId);

    int insert(OpLog record);

    int insertSelective(OpLog record);

    List<OpLog> selectByExampleWithBLOBs(OpLogExample example);

    List<OpLog> selectByExample(OpLogExample example);

    OpLog selectByPrimaryKey(Integer oplogId);

    int updateByExampleSelective(@Param("record") OpLog record, @Param("example") OpLogExample example);

    int updateByExampleWithBLOBs(@Param("record") OpLog record, @Param("example") OpLogExample example);

    int updateByExample(@Param("record") OpLog record, @Param("example") OpLogExample example);

    int updateByPrimaryKeySelective(OpLog record);

    int updateByPrimaryKeyWithBLOBs(OpLog record);

    int updateByPrimaryKey(OpLog record);
}