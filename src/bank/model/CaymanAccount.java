package bank.model;

import java.time.LocalDate;

public class CaymanAccount extends Account{
    private String secretCode;

    public CaymanAccount(){

    }

    public CaymanAccount(double balance, LocalDate openDate, Client client){
        //super(balance, openDate, client);
    }

    public CaymanAccount(double bal, LocalDate od, Client cn, String secretCode){
        //super(bal, od, cn); // invoco il costruttore della classe madre per inizializzare le sue variabili
        this.secretCode = secretCode;
    }

    public double evadeTax(){
        deposit(1000);
        return 0;
    }

    @Override // annotazione (questa è di compile time e non spunta nel bytecode) - vengono lette dal compilatore
    public double deposit(double amount){
        balance = amount + 1.1;
        return balance;  // il ritorno nell'override deve essere uguale al metodo originale
    }
}
