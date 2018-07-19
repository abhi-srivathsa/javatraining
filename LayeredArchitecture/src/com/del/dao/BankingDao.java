package com.del.dao;

import com.del.exception.BankingException;

public interface BankingDao {

	void depositAmount(double amount);

	double checkBalance();

	double withdrawAmount(double amount) throws BankingException;

}
