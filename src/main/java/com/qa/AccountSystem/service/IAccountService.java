package com.qa.AccountSystem.service;

import com.qa.AccountSystem.domain.Account;

public interface IAccountService {
	
	Iterable<Account> getAllAccounts();
	
	String deleteAccount(Long id);
	
	Account createAccount(Account account);

}
