package OOP.Polymorphism;

public class Teacher extends Person {
    private String fenn;

    public void setFenn(String fenn) {
        this.fenn = fenn;
    }

    public Teacher(String ad, String soyad, int yash, String fenn) {
        super(ad, soyad, yash);
        this.fenn = fenn;
    }

    @Override
    public void showInfo() {
        System.out.println(" ----- Muellim Melumatlari ----- ");
        super.showInfo();
        System.out.println("Fenn:" + " " + fenn);

    }

}

