package bank.model;
import java.time.LocalDate;

public class Account {
    public double balance;
    public final LocalDate openDate;
    public String client;

    public Account(){
        balance = 0;
        openDate = LocalDate.now();
        //this.client = getClient();
    }

    public Account(double balance, LocalDate openDate, String client){
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

    public String getClient(){
        return client;
    }

    public void setClient(String client){
        this.client = client;
    }

    //public abstract double deposit(double amount); // solo una classe astratta può avere metodi astratti

    // Method overload
    // Method signature: nome metodo + lista parametri
    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withDraw(double amount) throws BalanceException{  // è obbligatorio specificare se un metodo lancia un'eccezione
        if(balance >= amount){
            balance -= amount;
            return balance;
        }
        //IllegalArgumentException e = new IllegalArgumentException("Tentativo di ritiro superiore al saldo");
        BalanceException b = new BalanceException(balance, amount,
                String.format("Tentativo di ritiro superiore al saldo. Sforamento di %f", amount - balance));
        throw b;
    }
}
