package bank.model.special;

import bank.model.Account;
import bank.model.Client;

import java.time.LocalDate;
import java.util.Random;

public class SpecialAccount extends Account{
    private Random random = new Random();

    public SpecialAccount(double balance, LocalDate openDate, String client){
        super(balance, openDate, client);
    }

    @Override
    public double deposit(double amount){
        balance += amount;
        balance += random.nextInt(11);
        return balance;
    }
}
