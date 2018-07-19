package com.del.dao;

import com.del.exception.BankingException;
import com.del.util.Message;

public class BankingDaoImpl implements BankingDao {
	private double balance;
	private double minBalance = 1000;
	private String user = "deloitte";
	private String password = "password";

	@Override
	public void depositAmount(double amount) {
		balance = balance + amount;

	}

	@Override
	public double checkBalance() {
		return balance;

	}

	@Override
	public double withdrawAmount(double amount) throws BankingException {
		double bal = balance - amount;
		if (bal < minBalance) {
			throw new BankingException(Message.LOW_BALANCE);
		} else {
			balance = bal;
		}
		return amount;

	}

	@Override
	public boolean authenticate(String user, String password) {
		return this.user.equals(user) && this.password.equals(password);
	}

}
