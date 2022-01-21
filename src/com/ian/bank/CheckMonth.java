package com.ian.bank;

import com.ian.bank.object.BankTransaction;

import java.time.Month;

public class CheckMonth implements IFilter{
    Month month;
    public CheckMonth(Month month){
        this.month = month;
    }
    @Override
    public boolean test(BankTransaction transaction) {
        return transaction.getData().getMonth() == this.month;
    }
}
