package com.del.service;

	import java.util.List;

	import com.del.bean.User;
import com.del.bean.UserType;
import com.del.dao.MyDao;
	import com.del.dao.MyDaoImpl;

	public class MyServiceImpl implements MyService {
		MyDao mDao;
		
		public MyServiceImpl() {
			mDao = new MyDaoImpl();
		}

		@Override
		public String gettype(User usr) {
			return mDao.gettype(usr);
		}

		@Override
		public List<User> getAllUsers() {
			return mDao.getAllUsers();
		}

		@Override
		public List<UserType> getAllTypes() {
			return mDao.getAllTypes();
		}

		@Override
		public boolean register(User usr2) {
		return mDao.register(usr2);
			
		}

		@Override
		public boolean checklogin(String loginExist) {
		return mDao.checklogin(loginExist);
		}

	}


