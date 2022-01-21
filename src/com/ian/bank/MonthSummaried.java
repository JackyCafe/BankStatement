package com.ian.bank;

import com.ian.bank.object.BankTransaction;

import java.time.Month;

public class MonthSummaried implements ISummarize {
    Month month;

    public MonthSummaried(Month month) {
        this.month = month;
    }

    @Override
    public double summaried(double amount, BankTransaction transaction) {
        double money = amount;
        if (transaction.getData().getMonth() == month) {
            money += transaction.getAccount();
        }
        return money;
    }
}
