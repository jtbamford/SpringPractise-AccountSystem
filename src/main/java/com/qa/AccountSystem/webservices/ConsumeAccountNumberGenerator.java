package com.qa.AccountSystem.webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.AccountSystem.domain.Account;
import com.qa.AccountSystem.domain.POJOAccount;

@RestController
@CrossOrigin
public class ConsumeAccountNumberGenerator implements IConsumeAccountNumberGenerator {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private JmsTemplate jmsTemplate;

	@PostMapping
	public String consumeAccountNumber(Account account) {
		String accountNum=restTemplate.postForObject("http://localhost:8084/numbergen/create","",String.class);
		POJOAccount accountToSend = new POJOAccount();
		accountToSend.setId(account.getId());
		accountToSend.setAccountNumber(accountNum);
		accountToSend.setFirstName(account.getFirstName());
		accountToSend.setLastName(account.getLastName());
		jmsTemplate.convertAndSend("accountQueue",accountToSend);
		return accountNum;
	}
	
}
