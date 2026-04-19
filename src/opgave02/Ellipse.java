package opgave02;

public class Ellipse extends GeometriskFigur {
    private double radius1;
    private double radius2;


    public Ellipse(String navn, double radius1, double radius2) {
        super(navn);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public double getAreal() {
        return Math.PI * radius1 * radius2;
    }
}
