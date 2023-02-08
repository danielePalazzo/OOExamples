package bank;
import bank.model.Account;
import bank.model.CaymanAccount;
import bank.model.Client;
import bank.model.special.SpecialAccount;

import java.sql.SQLOutput;
import java.util.Date;
import java.time.LocalDate;

public class ApplicationStart {
    public static void main(String[] args) {
        System.out.println("Starting application");

        Account a1 = new Account();
//        System.out.println(a1.balance);
//        a1.balance = 100000;
//        a1.balance = -1000000;

//        System.out.println(a1.client);
//        System.out.println(a1.openDate);
        double newBalance = a1.deposit(1000.0);
        a1.deposit(500);

        System.out.println(a1.deposit(1000));
//        System.out.println(a1.balance);
        System.out.println(a1.getBalance());

        Client client = new Client(1, "Giuseppe", "Servero", LocalDate.now(), 'm');

        Account a2 = new Account(2500, LocalDate.now(), client);

        CaymanAccount ca = new CaymanAccount();
//        System.out.println("Cayman: " + ca.balance);
        ca.deposit(10000);
        ca.evadeTax();

        SpecialAccount sa1 = new SpecialAccount(100000, LocalDate.now(), client);
        sa1.setBalance(1000); // metodo nella classe madre

        Account a3 = new SpecialAccount(100000, LocalDate.now(), client);
//        Date x1 = new Date();
        Account acs[] = new Account[10];
//
//        // fully qualified name package
//        java.sql.Date y = new java.sql.Date(x1.getTime()); // package diverso, classe con stesso nome
    }

    public static void handleAccounts(Account acs[]){
        for (int i = 0; i < acs.length; i++){
            if (acs[i].getBalance() > 1000){
                acs[i].withDraw(10);
            }
        }
    }

    public static void handleAccount(Account x){
        Client clientName = x.getClient();
        if(clientName != null && clientName.getName().length() > 10 && clientName.getName().startsWith("sa")){
            x.deposit(10);
        }
    }
}










