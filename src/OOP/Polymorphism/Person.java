package OOP.Polymorphism;

public class Person {
    private String ad;
    private String soyad;
    private int yash;

    public Person(String ad, String soyad, int yash) {
        this.ad = ad;
        this.soyad = soyad;
        this.yash = yash;
    }

    public String getAd() {return ad;}


    public String getSoyad() {return soyad;}


    public int getYash() {return yash;}

    public void showInfo() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Yash: " + yash);
    }

}
