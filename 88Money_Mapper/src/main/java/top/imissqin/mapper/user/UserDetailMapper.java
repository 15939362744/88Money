package top.imissqin.mapper.user;

import top.imissqin.domain.UserDetail;

public interface UserDetailMapper {

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(UserDetail record);
}