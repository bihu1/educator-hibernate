package com.bihuniak.educator.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Account {
    @Id
    @GeneratedValue
    private long id;

    private long money;

    @Version
    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public Account() {
    }

    public Account(long money) {
        this.money = money;
    }

    public Account(long id, long money) {
        this.id = id;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
            "id=" + id +
            ", money=" + money +
            '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
}
