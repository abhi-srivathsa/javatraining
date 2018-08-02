package com.del.service;

import java.util.List;

import com.del.bean.User;
import com.del.bean.UserType;

public interface MyService {

	String gettype(User usr);

	List<User> getAllUsers();

	List<UserType> getAllTypes();

	boolean register(User usr2);

	boolean checklogin(String loginExist);

}
