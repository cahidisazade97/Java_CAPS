package OOP.Interface;

public class HendesiFiqur {
    static void main() {
        Kvadrat kvadrat = new Kvadrat(5);
        System.out.println("Kvadratın Sahəsi: " + kvadrat.sahesi());
        System.out.println("Kvadratın Perimetri: " + kvadrat.perimetri());

        Duzbucaq duzbucaq = new Duzbucaq(4, 6);
        System.out.println("Duzbucaqlının Sahəsi: " + duzbucaq.sahesi());
        System.out.println("Duzbucaqlının Perimetri: " + duzbucaq.perimetri());
    }

    }

