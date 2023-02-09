package bank.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Client{
    private long id;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private char sex;

    public Client(long id, String name, String lastName, LocalDate birthDate, char sex){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFullName(){
        return name + " " + lastName;
    }

    public String getFullNameSb(){
        StringBuilder sb = new StringBuilder(name).append(" ").append(lastName);
//        sb.append(" ");
//        sb.append(lastName);
        return sb.toString();
    }

    public LocalDate getBirthDate(){
        return birthDate;
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
