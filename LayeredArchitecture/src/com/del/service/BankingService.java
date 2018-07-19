package com.del.service;

import com.del.exception.BankingException;

public interface BankingService {

	void depositAmount(double amount) throws BankingException;

	double checkBalance();

	double withdrawAmount(double amount1) throws BankingException;

}
