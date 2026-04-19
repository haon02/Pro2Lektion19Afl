package opgave02;

public class Main {
    public static void main(String[] args) {
        SammensatFigur vindue = new SammensatFigur("Vindue");
        vindue.add(new Rektangel("Rude 1", 1, 1));
        vindue.add(new Rektangel("Rude 2", 1, 1));

        SammensatFigur hus = new SammensatFigur("Hus");
        hus.add(new Trekant("Tag", 10, 5));
        hus.add(vindue);

        hus.tegn();
        System.out.println(hus.getAreal());


    }
}
