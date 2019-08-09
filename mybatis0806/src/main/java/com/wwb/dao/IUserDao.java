package com.wwb.dao;

import com.wwb.domain.User;
import com.wwb.mybatis.annotation.Select;

import java.util.List;

public interface IUserDao {

	@Select("select * from user")
	List<User> findAll();
}

