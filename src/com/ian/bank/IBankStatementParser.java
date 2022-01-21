package com.ian.bank;

import com.ian.bank.object.BankTransaction;

import java.util.List;

public interface IBankStatementParser {
    public BankTransaction parserFrom(String line);
    public List<BankTransaction> parser(List<String> lines);
}
