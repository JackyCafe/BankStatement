package com.ian.bank;

import com.ian.bank.object.BankTransaction;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<BankTransaction> transactions;
    public Controller(List<BankTransaction> transactions){this.transactions=transactions;}
    public List<BankTransaction > findTransaction(IFilter filter){
        final  List<BankTransaction>  result = new ArrayList<>();
        for(BankTransaction transaction :transactions){
            if (filter.test(transaction))
                result.add(transaction);
        }
        return result;
    }

    public double summaried(ISummarize summarize){
        double amount = 0;
        for (BankTransaction transaction: transactions) {
            amount = summarize.summaried(amount,transaction);
        }
        return amount;
    }


}
