package bank.model.softwareHouse;

import java.time.LocalDate;

public class Developer extends Person{

    private String favouriteLanguage;

    public Developer(String firstName, String lastName, LocalDate birthDate, char sex, String favouriteLanguage){
        super(firstName, lastName, birthDate, sex);
        this.favouriteLanguage = favouriteLanguage;
    }

    public void setName(String name){
        this.firstName = name;
    }

    @Override
    public void work() {
        System.out.println("Penso penso penso...");
        System.out.println("Non ci ho ancora capito niente");
        System.out.println("Meglio che mi prenda un caffè");
        System.out.println("Aaah adesso ho capito!");
    }

    public String getFavouriteLanguage(){
        return favouriteLanguage;
    }
}
