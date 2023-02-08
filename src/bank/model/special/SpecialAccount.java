package bank.model.special;

import bank.model.Account;
import java.time.LocalDate;

public class SpecialAccount extends Account{

    public SpecialAccount(double balance, LocalDate openDate, String clientName){
        super(balance, openDate, clientName);
    }
}
