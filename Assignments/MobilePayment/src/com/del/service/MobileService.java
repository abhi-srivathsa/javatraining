package com.del.service;

import com.del.exception.MobileException;

public interface MobileService {

	void depositAmount(double amount) throws MobileException;

	double checkBalance();

	boolean authenticate(String user, String password);

}
