package OOP.Polymorphism;

public class Student extends Person {
    private String ixtisas;

    public Student(String ad, String soyad, int yash, String ixtisas) {
        super(ad, soyad, yash);
        this.ixtisas = ixtisas;
    }

    public void setIxtisas(String ixtisas) {
        this.ixtisas = ixtisas;
    }

    @Override
    public void showInfo() {
        System.out.println(" ----- Sagird Melumatlari ----- ");
        super.showInfo();
        System.out.println("Ixtisas:" + " " + ixtisas + "\n");
    }
}






