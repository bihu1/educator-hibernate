package com.bihuniak.educator;

import com.bihuniak.educator.account.Account;
import com.bihuniak.educator.account.AccountRepository;
import com.bihuniak.educator.account.AccountService;
import com.bihuniak.educator.animal.*;
import com.bihuniak.educator.file.DbFile;
import com.bihuniak.educator.file.DbFileRepository;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

@SpringBootTest
class EducatorApplicationTests {

	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private AccountService accountService;

	@Test
	void contextLoads(){
		Account account = new Account(1000);
		Long id = accountRepository.save(account).getId();

		Account account2 = new Account(1000);
		Long id2 = accountRepository.save(account2).getId();

		try {
			accountService.removeMoneyFromAccount(id,id2, 100);
		}catch (RuntimeException e){}

		System.out.println("Account 1:" + accountRepository.findById(id).get().getMoney());
		System.out.println("Account 2:" + accountRepository.findById(id2).get().getMoney());
	}

	@Test
	void contextLoads2(){
		Account account = new Account(1000);
		Long id = accountRepository.save(account).getId();

		Stream.of(100,100,100,100,100,100,100, 100,100,100,100,100,100,100, 100,100,100,100,100,100,100, 100,100,100,100,100,100,100, 100,100,100,100,100,100,100, 100,100,100,100,100,100,100, 100,100,100,100,100,100,100, 100,100,100,100,100,100,100).parallel()
			.forEach(x -> {
				try {
				System.out.println(accountService.removeMoneyFromAccount(id, x));
				}catch (RuntimeException e){
					System.out.println(false);
				}
			});

		System.out.println();
		System.out.println(accountRepository.findById(id).get().getMoney());
	}

	@Test
	void contextLoads4(){
		Account account = new Account(1000);
		Long id = accountRepository.save(account).getId();

		Stream.of(100,100,100,100, 100,100,100,100, 100, 100, 100, 100, 100).parallel()
			.forEach(x -> {
					accountService.removeMoneyFromAccount2(id, x);
			});

		System.out.println();
		System.out.println(accountRepository.findById(id).get().getMoney());
	}

	@Test
	void contextLoads5(){
		Account account = new Account(1000);
		long id = accountRepository.save(account).getId();

		Stream.of(100,100,100,100, 100,100,100,100, 100, 100).parallel()
			.forEach(x -> {
				System.out.println(accountService.removeMoneyFromAccount222(id, x));
			});

//		System.out.println();
//		System.out.println(accountRepository.findById(id).get().getMoney());
	}

	@Test
	void contextLoads3(){
		accountRepository.save(new Account(1000));
		accountRepository.save(new Account(10));
		System.out.println(accountRepository.myMethod(100));
	}

}
