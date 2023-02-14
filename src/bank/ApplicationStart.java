package bank;
import bank.model.Account;
import bank.model.BalanceException;
import bank.model.CaymanAccount;
import bank.model.Client;
import bank.model.special.SpecialAccount;

import java.sql.SQLOutput;
import java.util.Date;
import java.time.LocalDate;

public class ApplicationStart {
    public static void main(String[] args) {
        /*System.out.println("Starting application");

        Account a1 = new Account();
        double newBalance = a1.deposit(1000.0);

        a1.deposit(500);

        System.out.println(a1.balance);

        try{
            newBalance = a1.withDraw(1000);
            System.out.println(newBalance);
            newBalance = a1.withDraw(501);
            System.out.println(newBalance);
        } catch (BalanceException e){
            e.printStackTrace();
        }
        System.out.println("Fine main");


        /*Client client = new Client(1, "-", "-", LocalDate.now(), 'm');
        client.setName("Giacomo");
        client.setLastName("Corrado");
        System.out.println("Nome: " + client.getName());
        System.out.println("Cognome: " + client.getLastName());
        System.out.println(client.getBirthDate());

        //Account a2 = new Account(2500, LocalDate.now(), client);

        CaymanAccount ca = new CaymanAccount();
//        System.out.println("Cayman: " + ca.balance);
        ca.deposit(10000);
        ca.evadeTax();

        Account x = new CaymanAccount();
        if (x instanceof CaymanAccount){
            CaymanAccount y = (CaymanAccount) x; // casting da account a CaymanAccount (downcasting)
            y.evadeTax();
        }


        CaymanAccount x1 = new CaymanAccount();
        x1.deposit(1000); // CaymanAccount

//        Account x2 = new Account();
//        x2.deposit(1000); // Account

        Account x3 = new CaymanAccount(); // reference classe madre, oggetto classe figlia
        x3.deposit(1000); // CaymanAccount


        SpecialAccount sa1 = new SpecialAccount(100000, LocalDate.now(), client);
        sa1.setBalance(1000); // metodo nella classe madre

        Account a3 = new SpecialAccount(100000, LocalDate.now(), client);
//        Date x1 = new Date();
        Account acs[] = new Account[10];*/
//
//        // fully qualified name package
//        java.sql.Date y = new java.sql.Date(x1.getTime()); // package diverso, classe con stesso nome
        System.out.println("Inizio main");
        try{
            f1();
        } catch (BalanceException b){
            b.printStackTrace();
        }
        System.out.println("Fine main");
    } // main

    /*public static void handleAccounts(Account acs[]){
        for (int i = 0; i < acs.length; i++){
            if (acs[i].getBalance() > 1000){
                acs[i].withDraw(10);
            }
        }
    }*/
    public static void f1() throws BalanceException{
        System.out.println("Inizio f1");
        f2();
        System.out.println("Fine f1");
    }

    public static void f2() throws BalanceException{
        System.out.println("Inizio f2");
        f3();
        System.out.println("Fine f2");
    }

    /*public static void f3(){
        System.out.println("Inizio f3");
        Account a = new Account(5000, LocalDate.now(), "Mario Rossi");
        try {
            a.withDraw(4000);
            System.out.println("Ritiro di 4000 avvenuto con successo");

            a.withDraw(2000);
            System.out.println("Ritiro di 2000 avvenuto con successo");
        } catch (BalanceException b){
            b.getStackTrace();
        }

        System.out.println("Fine f3");
    }*/

    public static void f3() throws BalanceException{
        System.out.println("Inizio f3");
        Account a = new Account(5000, LocalDate.now(), "Mario Rossi");

        a.withDraw(4000);
        System.out.println("Ritiro di 4000 avvenuto con successo");

        a.withDraw(2000);
        System.out.println("Ritiro di 2000 avvenuto con successo");

        System.out.println("Fine f3");
    }

    /*public static void handleAccount(Account x){
        String clientName = x.getClient().getFullName();
        if(clientName != null && clientName.length() > 10 && clientName.startsWith("sa")){
            x.deposit(10);
        }
    }*/
}










