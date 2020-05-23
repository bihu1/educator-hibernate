package com.bihuniak.educator.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.CannotAcquireLockException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.print.DocFlavor;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Transactional
    public void removeMoneyFromAccount(Long id, Long id2, long money){
        Account account = accountRepository.findById(id).get();
        if(account.getMoney() > money) {
            account.setMoney(account.getMoney() - money);
            accountRepository.save(account);
        }
        aa();
        Account account2 = accountRepository.findById(id2).get();
        account2.setMoney(account2.getMoney() + money);
        accountRepository.save(account2);
    }

    @Transactional
    public long removeMoneyFromAccount(Long id, long money){
        Account account = accountRepository.findById(id).get();
        if (account.getMoney() > money) {
            account.setMoney(account.getMoney() - money);
            return accountRepository.save(account).getMoney();
        }
        return 0;
    }

    @Transactional
    public long removeMoneyFromAccount222(long id, long money){
        Account account = accountRepository.findById(id);
        if (account.getMoney() > money) {
            System.out.println(account.getVersion());
            account.setMoney(account.getMoney() - money);
            return accountRepository.save(account).getMoney();
        }
        return 0;
    }

    @Transactional
    public void removeMoneyFromAccount2(long id, long money){
        accountRepository.myMethod(id, money);
    }

    public void aa(){
        throw new RuntimeException();
    }

    public long transactionalTest(long id, long money){
        return removeMoneyFromAccount(id,money);
    }
}
