package opgave02;

public abstract class GeometriskFigur {
    private String navn;

    public GeometriskFigur(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public abstract double getAreal();

    public void tegn() {
        System.out.println(navn);
    }
}


