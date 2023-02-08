package bank.model;

import java.time.LocalDate;

public class CaymanAccount extends Account{
    private String secretCode;

    public CaymanAccount(){
        super();
    }

    public CaymanAccount(double bal, LocalDate od, Client cn, String secretCode){
        super(bal, od, cn); // invoco il costruttore della classe madre per inizializzare le sue variabili
        this.secretCode = secretCode;
    }

    public double evadeTax(){
        deposit(1000);
        return 0;
    }
}
