package app.student.management;

public abstract class Person {
    private String name;
    private String surname;
    private int age;
    private String email;

    public Person(String name, String surname, int age, String email) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        this.surname = surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();
        this.age = age;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void printDetails();
}