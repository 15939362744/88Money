package top.imissqin.mapper.user;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.imissqin.domain.user.UserDetail;
import top.imissqin.domain.user.UserDetailExample;
import top.imissqin.domain.user.UserDetailWithBLOBs;

public interface UserDetailMapper {
    long countByExample(UserDetailExample example);

    int deleteByExample(UserDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDetailWithBLOBs record);

    int insertSelective(UserDetailWithBLOBs record);

    List<UserDetailWithBLOBs> selectByExampleWithBLOBs(UserDetailExample example);

    List<UserDetail> selectByExample(UserDetailExample example);

    UserDetailWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDetailWithBLOBs record, @Param("example") UserDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") UserDetailWithBLOBs record, @Param("example") UserDetailExample example);

    int updateByExample(@Param("record") UserDetail record, @Param("example") UserDetailExample example);

    int updateByPrimaryKeySelective(UserDetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserDetailWithBLOBs record);

    int updateByPrimaryKey(UserDetail record);
}