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

        Developer d4 = new Developer("Ciro", "Cavalli", LocalDate.of(1990, 9, 22),
                'm', "Java");

        ScrumMaster sm1 = new ScrumMaster("Giovanni", "Rossi", LocalDate.of(1982, 3, 10),
                'm', 2, 0, 3);

//        Office o1 = new Office(d4);
//        for (int i = 0; i < d4.length; i++){
//            d4[i] = new Developer("Giovanni", "Bianchi", LocalDate.of(1982, 3, 10),
//                    'm', "Java");
//            System.out.printf(d4[i].getName());
//        }
        //o1.startDayOfWork();

        boolean added;

        checkAdded(sm1.addTeamMember(d1));
        checkAdded(sm1.addTeamMember(d2));

        added = sm1.addTeamMember(d3);  // fa la stessa cosa delle righe sopra
        checkAdded(added);

        sm1.examineTeam();

    }

    public static void checkAdded(boolean added){
        if(added){
            System.out.println("Ho aggiunto lo sviluppatore");
        } else{
            System.out.println("Il team era già al completo");
        }
    }
}
