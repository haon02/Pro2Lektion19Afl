package opgave02;

import java.util.ArrayList;
import java.util.List;

public class SammensatFigur extends GeometriskFigur {
    private List<GeometriskFigur> geometriskFigurer = new ArrayList<>();

    public SammensatFigur(String navn) {
        super(navn);

    }

    public void add(GeometriskFigur gf) {
        geometriskFigurer.add(gf);
    }

    public double getAreal() {
        double total = 0;
        for (GeometriskFigur f : geometriskFigurer) {
            total += f.getAreal();
        }
        return total;
    }

    @Override
    public void tegn() {
        super.tegn();
        for (GeometriskFigur f : geometriskFigurer) {
            f.tegn();
        }
    }
}
