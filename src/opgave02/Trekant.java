package opgave02;

public class Trekant extends GeometriskFigur {
    private double grundLinje;
    private double højde;


    public Trekant(String navn, double grundLinje, double højde) {
        super(navn);
        this.højde = højde;
        this.grundLinje = grundLinje;
    }

    @Override
    public double getAreal() {
        return 0.5 * grundLinje * højde;
    }
}
