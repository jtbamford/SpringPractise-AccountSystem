package com.qa.AccountSystem;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AccountSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountSystemApplication.class, args);
	}
	
	  @Bean
	  public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
}
