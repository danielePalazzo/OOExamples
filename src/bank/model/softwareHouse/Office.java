package bank.model.softwareHouse;

public class Office {
    private Person workers[];

    public Office(Person workers[]){
        this.workers = workers;
    }

    public void startDayOfWork(){
        for (int i = 0; i < workers.length; i++){
            if (workers[i] != null){
                workers[i].work();
            }
        }

        for (Person p : workers){ // per ogni persona p all'interno della sequenza workers
            p.speak();
        }
    }
}
