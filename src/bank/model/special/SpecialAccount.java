package bank.model.special;

import bank.model.Account;
import bank.model.Client;

import java.time.LocalDate;

public class SpecialAccount extends Account{

    public SpecialAccount(double balance, LocalDate openDate, Client client){
        super(balance, openDate, client);
    }
}
