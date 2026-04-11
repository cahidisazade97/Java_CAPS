package app.student.management;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class StudentService implements IStudentService {

    private HashMap<Integer, Student> studentMap = new HashMap<>();
    private HashSet<String> emailSet = new HashSet<>();

    @Override
    public void addStudent(Student st) {
        studentMap.put(st.getId(), st);
        emailSet.add(st.getEmail());
    }

    @Override
    public void deleteStudent(int id) {
        if (studentMap.containsKey(id)) {
            emailSet.remove(studentMap.get(id).getEmail());
            studentMap.remove(id);
            System.out.println("Tələbə silindi.");
        } else {
            System.out.println("ID tapılmadı.");
        }
    }

    @Override
    public void findStudentById(int id) {
        if (studentMap.containsKey(id)) {
            studentMap.get(id).printDetails();
        } else {
            System.out.println("Tələbə tapılmadı.");
        }
    }

    @Override
    public void updateStudent(int id, String name, String email, double grade) {
        if (studentMap.containsKey(id)) {
            Student s = studentMap.get(id);
            s.setName(name);
            s.setEmail(email);
            s.setGrade(grade);
        }
    }

    @Override
    public double calculateAverage() {
        if (studentMap.isEmpty()) return 0;
        double total = 0;
        for (Student s : studentMap.values()) {
            total += s.getGrade();
        }
        return total / studentMap.size();
    }

    @Override
    public Collection<Student> getAllStudents() {
        return studentMap.values();
    }

    public boolean isEmailExists(String email) {
        return emailSet.contains(email);
    }
}

