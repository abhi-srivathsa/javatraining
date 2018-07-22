package com.del.dao;

import com.del.exception.MobileException;
import com.del.util.Message;

public class MobileDaoImpl implements MobileDao {
	private double balance = 1000;
	private double minBalance = 1000;
	private String user = "9845798457";
	private String password = "password";

	@Override
	public void depositAmount(double amount) {
		balance = balance - amount;

	}

	@Override
	public double checkBalance() {
		return balance;

	}

	@Override
	public boolean authenticate(String user, String password) {
		return this.user.equals(user) && this.password.equals(password);
	}

}
