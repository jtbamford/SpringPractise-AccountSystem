package com.qa.AccountSystem.webservices;

import com.qa.AccountSystem.domain.Account;

public interface IConsumeAccountNumberGenerator {
	
	String consumeAccountNumber(Account account);

}
