package com.qa.AccountSystem.webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
public class ConsumeAccountNumberGenerator implements IConsumeAccountNumberGenerator {
	
	@Autowired
	private RestTemplate restTemplate;

	@PostMapping
	public String consumeAccountNumber() {
		//restTemplate.getForObject(url, responseType)
		return restTemplate.postForObject("http://localhost:8084/numbergen/create","",String.class);
	}
	
}
