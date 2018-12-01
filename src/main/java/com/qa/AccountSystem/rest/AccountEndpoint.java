package com.qa.AccountSystem.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.AccountSystem.domain.Account;
import com.qa.AccountSystem.service.IAccountService;

@RequestMapping("{base_endpoint}")
@RestController
@CrossOrigin
public class AccountEndpoint {
	
	@Autowired
	private IAccountService service;
	
	@GetMapping("${getall_endpoint}")
	public Iterable<Account> getAllAccounts() {
		return service.getAllAccounts();
	}
	
	@PostMapping("${create_endpoint}")
	public Account createAccount(@RequestBody Account account) {
		return service.createAccount(account);
	}
	
	@DeleteMapping("${delete_endpoint}")
	public String deleteAccount(@PathVariable Long id) {
		return service.deleteAccount(id);
	}

}
