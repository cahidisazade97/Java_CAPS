package OOP.Interface;

public class Duzbucaq implements IHendesiFiqur {
    private double eni;
    private double uzunlugu;

    public Duzbucaq(double eni, double uzunlugu) {
        this.eni = eni;
        this.uzunlugu = uzunlugu;
    }

    @Override
    public double sahesi() {
        return eni * uzunlugu;
    }

    @Override
    public double perimetri() {
        return 2 * (eni + uzunlugu);
    }

}
