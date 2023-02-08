package bank.model;
import java.time.LocalDate;

public class Account {
    protected double balance;
    private final LocalDate openDate;
    private String client;

    public Account(){
        balance = 1000;
        openDate = LocalDate.now();
        client = "Anonimo";
    }

    public Account(double balance, LocalDate openDate, String client){
        this.balance = balance;
        this.openDate = openDate;
        this.client = client;
    }

    public Account(double balance, LocalDate openDate){
        this(balance, openDate, "Anonimo"); // costruttore riga 15, fa le stesse cose delle istruzioni sotto
        /*balance = c;
        openDate = locD;
        client = "Anonimo";*/
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double amount){
        this.balance = amount*100;
    }

    public LocalDate getOpenDate(){
        return openDate;
    }

    public String getClient(){
        return client;
    }

    public void setClient(String client){
        this.client = client;
    }

    public double deposit(double amount){
        this.balance += amount;
        return balance;
    }

    // Method overload
    // Method signature: nome metodo + lista parametri
    public double deposit(double amount, double extra){
        balance += amount;
        balance += extra / 2;

        return balance;
    }

    public double withDraw(double amount){
        balance -= amount;
        return balance;
    }
}
