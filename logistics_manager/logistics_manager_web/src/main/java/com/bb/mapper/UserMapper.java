package com.bb.mapper;

import com.bb.pojo.User;
import com.bb.pojo.UserExample;
import com.bb.pojo.UserRoleKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	List<User> Userquery(User user);// 查询用户

	void insertUserAndRoles(List<UserRoleKey> list);// 新增用户权限
	
	void insertUserAndRole(UserRoleKey userRoleKey);

	void insertUser(User user); // 新增用户
}