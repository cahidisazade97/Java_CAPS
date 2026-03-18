package OOP.MashinCom;

public class Mashin {
    String marka;
    String model;
    String rengi;
    double motorHecmi;
    int qapiSayi;


    public Mashin(String marka, String model, String rengi, double motorHecmi, int qapiSayi) {
        this.marka = marka;
        this.model = model;
        this.rengi = rengi;
        this.motorHecmi = motorHecmi;
        this.qapiSayi = qapiSayi;

    }public void melumat() {
            System.out.println("Marka: " + marka);
            System.out.println("Model: " + model);
            System.out.println("Rengi: " + rengi);
            System.out.println("Motor Hecmi: " + motorHecmi);
            System.out.println("Qapı sayı: " + qapiSayi);
        }
    }
