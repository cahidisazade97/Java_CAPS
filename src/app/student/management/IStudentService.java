package app.student.management;

import java.util.Collection;

import java.util.Collection;

public interface IStudentService {
    void addStudent(Student st) throws StudentException;

    void deleteStudent(int id);

    void findStudentById(int id);

    void updateStudent(int id, String name, String email, double grade);

    double calculateAverage();

    Collection<Student> getAllStudents();
}

