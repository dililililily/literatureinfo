package com.wit.literatureinfo.dao;

import com.wit.literatureinfo.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    /**
     * 查询用户名是否存在，若存在，不允许注册
     * 注解@Param(value) 若value与可变参数相同，注解可省略
     * 注解@Results  列名和字段名相同，注解可省略
     *
     * @param user_name
     * @return
     */
    @Select(value = "select u.user_name,u.password from user u where u.user_name=#{user_name}")
    @Results({@Result(property = "user_name", column = "user_name"),
            @Result(property = "password", column = "password")})
    User findUserByName(@Param("user_name") String user_name);

    /**
     * 注册  插入一条user记录
     *
     * @param user
     * @return
     */

    @Insert("insert into user values(#{user_id},#{user_name},#{password},#{role_id})")
    // 加入该注解可以保存对象后，查看对象插入id
    @Options(useGeneratedKeys = true, keyProperty = "user_id", keyColumn = "user_id")
    void register(User user);

    /**
     * 登录
     *
     * @param user
     * @return
     */
    @Select("select u.user_id from user u where u.user_name = #{user_name} and password = #{password}")
    Long login(User user);
}
