package bank.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Client {
    private long id;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private char sex;

    public String getFullName(){
        return name + " " + lastName;
    }

    public String getFullNameSb(){
        StringBuilder sb = new StringBuilder(name).append(" ").append(lastName);
//        sb.append(" ");
//        sb.append(lastName);
        return sb.toString();
    }

    public int getAge(){
        Period p = birthDate.until(LocalDate.now());
        int years = p.getYears();
        return years;
    }

    public int getAge2(){
        long years = ChronoUnit.YEARS.between(birthDate, LocalDate.now());
        return (int)years;
    }

    public long getId(){
        return id;
    }

    public char getSex(){
        return sex;
    }
}
