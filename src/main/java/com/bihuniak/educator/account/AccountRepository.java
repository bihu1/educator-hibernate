package com.bihuniak.educator.account;

import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.persistence.LockModeType;
import java.util.List;
import java.util.Optional;

public interface AccountRepository extends CrudRepository<Account, Long> {

    List<Account> findByMoneyGreaterThan(long money);

    @Query("FROM Account a WHERE a.money > :money")
    List<Account> myMethod(@Param("money") long money);

    @Modifying
    @Query("UPDATE Account a SET a.money = a.money - :money WHERE a.id = :id AND a.money >= :money")
    void myMethod(@Param("id") long id, @Param("money") long money);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Account findById(long id);

}