package com.ian.bank;

import com.ian.bank.object.BankTransaction;

@FunctionalInterface
public interface ISummarize {
    public double summaried(double amount, BankTransaction transaction);
}
