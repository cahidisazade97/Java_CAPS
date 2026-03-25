package OOP.Interface;

public class Kvadrat implements IHendesiFiqur{
    private double teref;

    public Kvadrat(double teref) {
        this.teref = teref;
    }

    @Override
    public double sahesi() {
        return teref * teref;
    }

    @Override
    public double perimetri() {
        return 4 * teref;
    }
}
