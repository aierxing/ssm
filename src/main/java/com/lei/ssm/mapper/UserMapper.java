package com.lei.ssm.mapper;

import com.lei.ssm.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Delete("delete from user where username = #{username}")
    int delete(String username);

    @Insert("insert into user (username,password,Permission) values(#{username},#{password},#{Permission})")
    int insert(@Param("username")String username,@Param("password")String password,@Param("Permission")String Permission);

    @Select("select * from User")
    List<User> findAll();

    @Update("update user set username = #{username} where id = #{id}")
    int update(String username,int id);
}