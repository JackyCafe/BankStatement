package com.ian.bank.object;

import java.io.Serializable;
import java.time.LocalDate;

public class BankTransaction implements Serializable {
    final LocalDate date;
    final int account;
    final String description;


    public BankTransaction(LocalDate date, int account, String description) {
        this.date = date;
        this.account = account;
        this.description = description;
    }

    public LocalDate getData() {
        return date;
    }

    public int getAccount() {
        return account;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "date=" + date +
                ", account=" + account +
                ", description='" + description + '\'' +
                '}';
    }
}
