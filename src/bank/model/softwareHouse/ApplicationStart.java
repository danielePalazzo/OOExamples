package bank.model.softwareHouse;

import java.time.LocalDate;

public class ApplicationStart {
    public static void main(String[] args) {
        Developer d1 = new Developer("Mauro", "Rossi", LocalDate.of(1980, 6, 20),
                'm', "Java");

        Developer d2 = new Developer("Laura", "Bianchi", LocalDate.of(1980, 4, 15),
                'f', "JavaScript");

        Developer d3 = new Developer("Luca", "Cappello", LocalDate.of(1990, 9, 22),
                'm', "Java");

        ScrumMaster sm1 = new ScrumMaster("Giovanni", "Rossi", LocalDate.of(1982, 3, 10),
                'm', 2, -2, 2);

        boolean added = sm1.addTeamMember(d1);
        if(added){
            System.out.println("Ho aggiunto lo sviluppatore");
        } else{
            System.out.println("Il team era già al completo");
        }

        added = sm1.addTeamMember(d2);
        if(added){
            System.out.println("Ho aggiunto lo sviluppatore");
        } else{
            System.out.println("Il team era già al completo");
        }

        added = sm1.addTeamMember(d3);
        if(added){
            System.out.println("Ho aggiunto lo sviluppatore");
        } else{
            System.out.println("Il team era già al completo");
        }

    }
}
