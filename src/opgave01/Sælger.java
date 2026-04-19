package opgave01;

import java.util.HashSet;
import java.util.Set;

public class Sælger implements Observer {
    private String navn;

    public Sælger(String navn) {
        this.navn = navn;
    }


    //    Der er udskrevet en liste på skærmen med titlen på de bøger, der er købt af andre
//    kunder, der også har købt den netop solgte bog s. Listen må ikke indeholde den
//    samme titel flere gange. Endvidere skal listen ikke indeholde titlen på den aktuelle bog.
    @Override
    public void update(Subject subject) {
        if (subject instanceof BogTitel) {
            BogTitel solgteBog = (BogTitel) subject;
            Set<String> anbefalinger = new HashSet<>();
            for (Kunde k : solgteBog.getKunder()) {
                for (BogTitel b : k.getBogTitler()) {
                    if (!b.equals(solgteBog)) {
                        anbefalinger.add(b.getTitel());
                    }
                }
            }
            System.out.println("Kunder der købte: " + solgteBog.getTitel() + " købte også:");
            for (String titel : anbefalinger) {
                System.out.println(titel);
            }
        }
    }
}