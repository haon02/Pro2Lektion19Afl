package opgave02;

public class Rektangel extends GeometriskFigur {
    private double længde;
    private double bredde;

    public Rektangel(String navn, double længde, double bredde) {
        super(navn);
        this.bredde = bredde;
        this.længde = længde;
    }

    @Override
    public double getAreal() {
        return bredde * længde;
    }
}
