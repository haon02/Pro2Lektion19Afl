package opgave01;

import java.util.ArrayList;

public class Kunde {
    private String navn;
    private ArrayList<BogTitel> bogTitler = new ArrayList<>();


    public Kunde(String navn) {
        this.navn = navn;
        this.bogTitler = new ArrayList<>();
    }

    public ArrayList<BogTitel> getBogTitler() {
        return new ArrayList<BogTitel>(bogTitler);
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addBogtitel(BogTitel bogTitel) {
        if (!bogTitler.contains(bogTitel)) {
            bogTitler.add(bogTitel);
            bogTitel.etKoeb(this);
        }
    }

    public void removeBogtitel(BogTitel bogTitel) {
        if (bogTitler.contains(bogTitel)) {
            bogTitler.remove(bogTitel);
            bogTitel.removeKunde(this);
        }
    }

}
