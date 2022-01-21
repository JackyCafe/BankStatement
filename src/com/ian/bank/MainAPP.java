package com.ian.bank;

import com.ian.bank.object.BankTransaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class MainAPP {
    final static String src = "src/resources/";

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(src,args[0]);
        List<String> lines = Files.readAllLines(path);
        IBankStatementParser csv_file = new BankStatementCSVParser();
//        List<BankTransaction> transactions = csv_file.parser(lines);
        Controller controller = new Controller(csv_file.parser(lines));
        List<BankTransaction> transactions= controller.findTransaction(new CheckMonth(Month.NOVEMBER));
        transactions.stream().forEach(t-> System.out.println(t));
        double amount = controller.summaried(new MonthSummaried(Month.NOVEMBER));
        System.out.println(amount);

    }
}
