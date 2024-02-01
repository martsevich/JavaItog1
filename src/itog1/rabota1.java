package itog1;
import java.util.*;
public class rabota1 {
    public static void main(String[] args) {        // для хранения телефонной книги cоздаем HashMap
        Map<String, List<String>> phoneBook = new HashMap<>();
        // добавляем контакты
        contact(phoneBook, "Сидоров", phoneNumber());
        contact(phoneBook, "Иванов", phoneNumber());
        contact(phoneBook, "Сидоров", phoneNumber());
        contact(phoneBook, "Иванов", phoneNumber());
        contact(phoneBook, "Петров", phoneNumber());
        contact(phoneBook, "Сидоров", phoneNumber());
        printPhoneBook(phoneBook);
    }
    // метод для добавления контактов
    private static void contact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        // Если контакт есть, объеденяем, иначе создаем новый
        if (phoneBook.containsKey(name)) {
            List<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }
    private static String phoneNumber() {   // метод для поиска случайного номера
        Random random = new Random();
        return "+375 (29) " +
                String.format("%02d", random.nextInt(100)) + "-" +
                String.format("%02d", random.nextInt(1000)) + "-" +
                String.format("%02d", random.nextInt(100));
    }
    private static void printPhoneBook(Map<String, List<String>> phoneBook) {   // вывод контактов
        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
        sortedEntries.sort(Comparator.comparingInt(entry -> entry.getValue().size()));
        for (int i = sortedEntries.size() - 1; i >= 0; i--) {
            Map.Entry<String, List<String>> entry = sortedEntries.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}