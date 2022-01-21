package com.ian.bank;

import com.ian.bank.object.BankTransaction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class BankStatementCSVParser implements IBankStatementParser{
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    @Override
    public BankTransaction parserFrom(String line) {
        String [] cols = line.split(",");
        LocalDate date =  LocalDate.parse(cols[0],formatter);
        int account = Integer.parseInt(cols[1]);
        String description = cols[2];
        return new BankTransaction(date,account,description);
    }

    @Override
    public List<BankTransaction> parser(List<String> lines) {
        return lines.stream().map(this::parserFrom).collect(Collectors.toList());
    }
}
