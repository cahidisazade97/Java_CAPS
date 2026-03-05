public class _02_HomeWork {

    public void main(String[] args) {


        Student s1 = new Student();
        s1.ad = "Ali";
        s1.soyad = "Aliyev";
        s1.ataAdi = "Rashad";
        s1.yas = 15;
        s1.mektebNo = 1;
        s1.sinif = 9;
        s1.cins = 'K';


        Student s2 = new Student();
        s2.ad = "Nigar";
        s2.soyad = "Memmedova";
        s2.ataAdi = "Elchin";
        s2.yas = 14;
        s2.mektebNo = 2;
        s2.sinif = 8;
        s2.cins = 'Q';


        Student s3 = new Student();
        s3.ad = "Murad";
        s3.soyad = "Hasanov";
        s3.ataAdi = "Kamran";
        s3.yas = 16;
        s3.mektebNo = 3;
        s3.sinif = 10;
        s3.cins = 'K';

        System.out.println("===== 1-ci Shagird =====");
        System.out.println("Ad: " + s1.ad);
        System.out.println("Soyad: " + s1.soyad);
        System.out.println("Ata adi: " + s1.ataAdi);
        System.out.println("Yas: " + s1.yas);
        System.out.println("Mekteb No: " + s1.mektebNo);
        System.out.println("Sinif: " + s1.sinif);
        System.out.println("Cins: " + s1.cins);

        System.out.println();

        System.out.println("===== 2-ci Shagird =====");
        System.out.println("Ad: " + s2.ad);
        System.out.println("Soyad: " + s2.soyad);
        System.out.println("Ata adi: " + s2.ataAdi);
        System.out.println("Yas: " + s2.yas);
        System.out.println("Mekteb No: " + s2.mektebNo);
        System.out.println("Sinif: " + s2.sinif);
        System.out.println("Cins: " + s2.cins);

        System.out.println();

        System.out.println("===== 3-cu Shagird =====");
        System.out.println("Ad: " + s3.ad);
        System.out.println("Soyad: " + s3.soyad);
        System.out.println("Ata adi: " + s3.ataAdi);
        System.out.println("Yas: " + s3.yas);
        System.out.println("Mekteb No: " + s3.mektebNo);
        System.out.println("Sinif: " + s3.sinif);
        System.out.println("Cins: " + s3.cins);
    }
}

class Student {

    String ad;
    String soyad;
    String ataAdi;
    int yas;
    int mektebNo;
    int sinif;
    char cins;

}
