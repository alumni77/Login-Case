package com.zjedu.login.mapper;

import com.zjedu.login.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Lay
 */
@Mapper
public interface LoginMapper
{
    @Select("select * from tb_user where  phone = #{user.phone}")
    User findUsers(@Param("user") User user);
}
