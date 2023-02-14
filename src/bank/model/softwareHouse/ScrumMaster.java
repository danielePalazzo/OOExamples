package bank.model.softwareHouse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class ScrumMaster extends Person{

    public final int MAX_TEAM_SIZE;
    private int yearsOfExperience;
    private int levelOfPatience;
    private ArrayList<Developer> team;
    private String pronoums[] = {"Cosa", "Come", "Perchè", "Dove"};
    private String verbs[] = {"è", "significa", "si trova", "indica"};
    private String objects[] = {"polimorfismo", "classe astratta", "sviluppo agile", "costruttore", "programmazione object oriented"};
    private Random generator = new Random();

    public ScrumMaster(String firstName, String lastName, LocalDate birthDate, char sex, int yearsOfExperience, int levelOfPatience, int teamSize) {
        super(firstName, lastName, birthDate, sex);
        this.yearsOfExperience = yearsOfExperience;
        this.levelOfPatience = levelOfPatience;
        this.team = new ArrayList<>();
        this.MAX_TEAM_SIZE = teamSize;
        this.generator = new Random();
    }

    public ScrumMaster(String firstName, String lastName, LocalDate birthDate, char sex, int yearsOfExperience,
                       int levelOfPatience, int teamSize, ArrayList<Developer> team){
        super(firstName, lastName, birthDate, sex);
        this.yearsOfExperience = yearsOfExperience;
        this.levelOfPatience = levelOfPatience;
        this.team = team;
        this.MAX_TEAM_SIZE = teamSize;
        this.generator = new Random();
    }

    @Override
    public void work() {
        System.out.println("Sostanzialmente faccio lavorare gli altri");
        if (levelOfPatience <= 0){
            System.out.println("Vi prendo tutti a bastonate");
        }
    }

    private String makeQuestion(){
        int p1 = generator.nextInt(pronoums.length);
        int p2 = generator.nextInt(verbs.length);
        int p3 = generator.nextInt(objects.length);

        String question = pronoums[p1] + " " + verbs[p2] + " " + objects[p3];
        question = String.format("%s %s %s?", pronoums[p1], verbs[p2], objects[p3]); // %s verrà sostituito con la variabile che gli passiamo dopo

        return question;
    }

    public void examineTeam(){
        for (Developer d : team){
            String question = makeQuestion();
            String output = String.format("%s chiede: %s", d.getFullName(), question);
            System.out.println(output);

            answerQuestion(question);

            if(levelOfPatience > 0){
                System.out.println("Avanti il prossimo");
            } else{
                System.out.println("Ma li mortacci vostri");
                System.out.println("BASTA! ME NE VADO AI CARAIBI");
                break;
            }
        }
    }

    public void answerQuestion(String question){
        //if (question.length() % 2 == 0)
        if ((question.length() & 1) == 0){
            System.out.println("Bravo bella domanda");
            levelOfPatience++;
        } else{
            System.out.println("Ma come ti viene in mente una cosa del genere?!");
            levelOfPatience -= 2;
        }
    }

    public boolean addTeamMember(Developer d){
        if (team.size() < MAX_TEAM_SIZE){
            team.add(d); // aggiunge il parametro all'array list
            return true;
        }
        return false;
    }

    // true più maschi, altrimenti false
    public boolean hasMoreMales(){
        int males = 0;
        int females = 0;
        for (Developer d : team){
            if (d.isMale()){
                males++;
            } else{
                females++;
            }
        }
//        if (males > females){
//            return true;
//        }
        return males > females;
    }

    public int countJavaDevelopers(){
        return countLanguageDevelopers("Java");
    }

    public int countLanguageDevelopers(String language){
        int count = 0;
        for (Developer d : team){
            if(d.getFavouriteLanguage().equalsIgnoreCase(language)){
                count++;
            }
        }
        return count;
    }
}