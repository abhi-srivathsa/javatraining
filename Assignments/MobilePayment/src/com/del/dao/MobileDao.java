package com.del.dao;

import com.del.exception.MobileException;

public interface MobileDao {

	void depositAmount(double amount);

	double checkBalance();

	boolean authenticate(String user, String password);

}
