package bank.model;

public class BalanceException extends Exception{
    private double balance;
    private double amount;

    public BalanceException(double balance, double amount, String message){
        super(message);
        this.balance = balance;
        this.amount = amount;
    }

    public double getBalance(){
        return balance;
    }

    public double getAmount() {
        return amount;
    }
}
