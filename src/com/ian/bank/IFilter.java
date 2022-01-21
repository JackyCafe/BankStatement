package com.ian.bank;

import com.ian.bank.object.BankTransaction;

@FunctionalInterface
public interface IFilter {
    public boolean test(BankTransaction transaction);
}
