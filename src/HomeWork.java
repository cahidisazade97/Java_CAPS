import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();

        while (true) {

            System.out.println("\n===== CANLI LUGET =====");
            System.out.println("1 - Elave et");
            System.out.println("2 - Redakte et");
            System.out.println("3 - Siyahini goster");
            System.out.println("4 - Axtaris");
            System.out.println("5 - Sil");
            System.out.println("6 - Cixis");
            System.out.print("Seciminizi daxil edin: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Sozu daxil edin: ");
                    String word = scanner.nextLine();

                    System.out.print("Menasini daxil edin: ");
                    String meaning = scanner.nextLine();

                    dictionary.put(word, meaning);
                    System.out.println("Soz elave olundu.");
                    break;

                case 2:
                    System.out.print("Redakte etmek istediyiniz sozu daxil edin: ");
                    String editWord = scanner.nextLine();

                    if (dictionary.containsKey(editWord)) {
                        System.out.print("Yeni menani daxil edin: ");
                        String newMeaning = scanner.nextLine();

                        dictionary.put(editWord, newMeaning);
                        System.out.println("Mena yenilendi.");
                    } else {
                        System.out.println("Bu soz tapilmadi.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Butun sozler ---");
                    for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                        System.out.println(entry.getKey() + " -> " + entry.getValue());
                    }
                    break;

                case 4:
                    System.out.print("Axtarilan sozu daxil edin: ");
                    String searchWord = scanner.nextLine();

                    if (dictionary.containsKey(searchWord)) {
                        System.out.println("Mena: " + dictionary.get(searchWord));
                    } else {
                        System.out.println("Soz tapilmadi.");
                    }
                    break;

                case 5:
                    System.out.print("Silmek istediyiniz sozu daxil edin: ");
                    String deleteWord = scanner.nextLine();

                    dictionary.remove(deleteWord);
                    System.out.println("Soz silindi.");
                    break;

                case 6:
                    System.out.println("Programdan cixildi.");
                    return;

                default:
                    System.out.println("Yanlis secim!");
            }
        }
    }
}
