package bank.model;
import java.time.LocalDate;

public abstract class Account {
    protected double balance;
    private final LocalDate openDate;
    private Client client;

    /*public Account(){
        balance = 1000;
        openDate = LocalDate.now();
        this.client = getClient();
    }*/

    public Account(double balance, LocalDate openDate, Client client){
        this.balance = balance;
        this.openDate = openDate;
        this.client = client;
    }

//    public Account(double balance, LocalDate openDate){
//        this(balance, openDate, "Anonimo"); // costruttore riga 15, fa le stesse cose delle istruzioni sotto
//    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double amount){
        this.balance = amount * 100;
    }

    public LocalDate getOpenDate(){
        return openDate;
    }

    public Client getClient(){
        return client;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public abstract double deposit(double amount); // solo una classe astratta può avere metodi astratti

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
