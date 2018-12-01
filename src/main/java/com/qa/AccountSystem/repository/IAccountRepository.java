package com.qa.AccountSystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qa.AccountSystem.domain.Account;

@Repository
public interface IAccountRepository extends CrudRepository<Account,Long> {
	

}
