package com.del.service;

import com.del.dao.MobileDao;
import com.del.dao.MobileDaoImpl;
import com.del.exception.MobileException;
import com.del.util.Message;

public class MobileServiceImpl implements MobileService {
	private MobileDao bDao;

	public MobileServiceImpl() {
		bDao = new MobileDaoImpl();

	}

	@Override
	public void depositAmount(double amount) throws MobileException {
		if (amount < 0) {
			throw new MobileException(Message.NEGATIVE_VALUE);
		}
		bDao.depositAmount(amount);

	}

	@Override
	public double checkBalance() {
		return bDao.checkBalance();

	}

	@Override
	public boolean authenticate(String user, String password) {
		// TODO Auto-generated method stub
		return bDao.authenticate(user, password);
	}

}
