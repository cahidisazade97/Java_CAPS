package app.student.management;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Student extends Person {
    private int id;
    private double grade;
    private LocalDateTime createdAt;

    public Student(int id, String name, String surname, int age, String email, double grade) {
        super(name, surname, age, email);
        this.id = id;
        this.grade = grade;
        this.createdAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public void printDetails() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("ID: " + id +
                " | Ad: " + getName() +
                " | Soyad: " + getSurname() +
                " | Yaş: " + getAge() +
                " | Email: " + getEmail() +
                " | Ortalama: " + grade +
                " | Qeydiyyat: " + createdAt.format(dtf));
    }
}


