package com.qa.AccountSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.AccountSystem.constants.Constants;
import com.qa.AccountSystem.domain.Account;
import com.qa.AccountSystem.repository.IAccountRepository;
import com.qa.AccountSystem.webservices.IConsumeAccountNumberGenerator;

@Service
public class AccountService implements IAccountService {
	
	@Autowired
	private IAccountRepository repo;
	
	@Autowired
	private IConsumeAccountNumberGenerator numgen;
	
	
	public Iterable<Account> getAllAccounts() {
		return repo.findAll();
	}
	
	public String deleteAccount(Long id) {
		repo.deleteById(id);
		return Constants.DELETE_STRING;
	}

	public Account createAccount(Account account) {
		account.setAccountNumber(numgen.consumeAccountNumber(account)); //implement other API
		return repo.save(account);
	}
	
}
