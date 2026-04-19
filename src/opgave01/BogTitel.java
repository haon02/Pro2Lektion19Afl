package opgave01;

import java.util.ArrayList;

public class BogTitel implements Subject {
    private String titel;
    private int antal;
    private ArrayList<Kunde> kunder = new ArrayList<>();
    private ArrayList<Observer> observers = new ArrayList<>();

    public BogTitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
        this.kunder = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public ArrayList<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }

    public int getAntal() {
        return antal;
    }

    public String getTitel() {
        return titel;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void etKoeb(Kunde kunde) {
        if (!kunder.contains(kunde)) {
            kunder.add(kunde);
            kunde.addBogtitel(this);
            antal--;
            this.notifyObservers();
        }

    }


    public void removeKunde(Kunde kunde) {
        if (kunder.contains(kunde)) {
            kunder.remove(kunde);
            kunde.removeBogtitel(this);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }

    }

    private void notifyObservers() {
        for (Observer observer : observers){
            observer.update(this);
        }

    }

    public void indKoebTilLager(int antal) {
        this.antal += antal;

    }
}
