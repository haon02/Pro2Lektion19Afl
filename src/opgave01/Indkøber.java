package opgave01;

public class Indkøber implements Observer {
    private String navn;

    public Indkøber(String navn) {
        this.navn = navn;
    }

    //Hvis der er mindre end 6 bøger tilbage af bogtitelen s, udskrives på skærmen, at der
    //skal bestilles 10 bøger med den pågældende titel. Endvidere registreres med det
    //samme at der er købt 10 bøger til lageret.
    @Override
    public void update(Subject subject) {
        if (subject instanceof BogTitel) {
            BogTitel bogTitel = (BogTitel) subject;
            if (bogTitel.getAntal() < 6) {
                System.out.println("Der skal bestilles 10 eksemplarer mere af: " + bogTitel.getTitel());
                bogTitel.indKoebTilLager(10);

            }
        }
    }
}
