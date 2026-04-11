package app.student.management;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;


public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IStudentService service = new StudentService();

        while (true) {
            System.out.println("\n====== Student Management System =======");
            System.out.println("1. Yeni tələbə əlavə et");
            System.out.println("2. Tələbə siyahısını göstər");
            System.out.println("3. ID ilə tələbə axtar");
            System.out.println("4. Tələbəni sil");
            System.out.println("5. Tələbə məlumatlarını yenilə");
            System.out.println("6. Orta balı hesabla");
            System.out.println("7. Çıxış");
            System.out.println("=========================================");
            System.out.print("Seçiminizi daxil edin: ");

            int choice;
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Xəta: Zəhmət olmasa menyudakı rəqəmlərdən birini seçin!");
                input.next();
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("ID: ");
                        int id = input.nextInt();
                        System.out.print("Ad: ");
                        String name = input.next();
                        System.out.print("Soyad: ");
                        String surname = input.next();
                        System.out.print("Yaş: ");
                        int age = input.nextInt();
                        System.out.print("Email: ");
                        String email = input.next();
                        System.out.print("Qiymət: ");
                        double grade = input.nextDouble();


                        service.addStudent(new Student(id, name, surname, age, email, grade));
                        System.out.println("Tələbə uğurla əlavə edildi.");

                    } catch (StudentException e) {

                        System.out.println("Xəta: " + e.getMessage());
                    } catch (InputMismatchException e) {

                        System.out.println("Xəta: Məlumatları düzgün formatda daxil edin (ID və Qiymət rəqəm olmalıdır)!");
                        input.next();
                    }
                    break;

                case 2:
                    Collection<Student> students = service.getAllStudents();
                    if (students.isEmpty()) {
                        System.out.println("Sistemdə tələbə yoxdur.");
                    } else {
                        students.forEach(Student::printDetails);
                    }
                    break;

                case 3:
                    System.out.print("Axtarılan ID: ");
                    int searchId = input.nextInt();
                    service.findStudentById(searchId); // Service özü tapıb çap edəcək
                    break;

                case 4:
                    System.out.print("Silinəcək ID: ");
                    int removeId = input.nextInt();
                    service.deleteStudent(removeId);
                    break;

                case 5:
                    try {
                        System.out.print("Yenilənəcək ID: ");
                        int upId = input.nextInt();
                        System.out.print("Yeni Ad: ");
                        String upName = input.next();
                        System.out.print("Yeni Email: ");
                        String upEmail = input.next();
                        System.out.print("Yeni Qiymət: ");
                        double upGrade = input.nextDouble();

                        service.updateStudent(upId, upName, upEmail, upGrade);
                        System.out.println("Məlumatlar yeniləndi.");
                    } catch (Exception e) {
                        System.out.println("Yeniləmə zamanı xəta baş verdi!");
                        input.next();
                    }
                    break;

                case 6:
                    double avg = service.calculateAverage();
                    System.out.println("Bütün tələbələrin orta balı: " + avg);
                    break;

                case 7:
                    System.out.println("Sistemdən çıxılır... Sağ olun!");
                    return;

                default:
                    System.out.println("Yanlış seçim! 1-7 arası rəqəm daxil edin.");
            }
        }
    }
}

