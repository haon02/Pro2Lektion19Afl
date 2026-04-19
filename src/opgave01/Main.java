package opgave01;

public class Main {
    public static void main(String[] args) {
        Sælger hansen = new Sælger("Hansen");
        Indkøber jensen = new Indkøber("Jensen");
        BogTitel andersAnd = new BogTitel("Anders And", 6);
        BogTitel java = new BogTitel("Java", 8);
        Kunde hest1 = new Kunde("Læsehest1");
        Kunde hest2 = new Kunde("Læsehest2");
        Kunde hest3 = new Kunde("Læsehest3");

        hest1.addBogtitel(java);
        hest1.addBogtitel(andersAnd);
        hest2.addBogtitel(java);
        hest2.addBogtitel(andersAnd);
        hest3.addBogtitel(java);
        hest3.addBogtitel(andersAnd);

        hansen.update(andersAnd);
        jensen.update(andersAnd);
        jensen.update(java);
    }
}
