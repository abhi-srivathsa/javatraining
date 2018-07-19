package com.del.service;

import com.del.dao.BankingDao;
import com.del.dao.BankingDaoImpl;
import com.del.exception.BankingException;
import com.del.util.Message;

public class BankingServiceImpl implements BankingService {
	private BankingDao bDao;
	public BankingServiceImpl() {
		bDao = new BankingDaoImpl();
	
	}

	@Override
	public void depositAmount(double amount) throws BankingException {
		if(amount<0) {
			throw new BankingException (Message.NEGATIVE_VALUE);
		}
		bDao.depositAmount(amount);
		
	}

	@Override
	public double checkBalance() {
		return bDao.checkBalance();
		
	}

	@Override
	public double withdrawAmount(double amount1) throws BankingException {
		return bDao.withdrawAmount(amount1);
		
	}

}
