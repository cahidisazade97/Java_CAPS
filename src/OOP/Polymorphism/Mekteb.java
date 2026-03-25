package OOP.Polymorphism;

public class Mekteb {
    static void main() {
        Student student1 = new Student("Ilyas", "Abbasov", 22, "Kompyuter Muhendisliyi");
        student1.showInfo();

        Teacher tc1 = new Teacher("Nihad", "Resulzade", 35, "Riyaziyyat");
        tc1.showInfo();
    }
}
