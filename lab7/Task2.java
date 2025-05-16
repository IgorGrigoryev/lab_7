package lab7;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void task2() {
        HashMap<String, String> phoneBook = new HashMap<>();

        // Додавання елементів до телефонної книги
        phoneBook.put("Іваненко", "+380671234567");
        phoneBook.put("Петренко", "+380931234567");
        phoneBook.put("Сидоренко", "+380501234567");
        phoneBook.put("Коваленко", "+380662345678");
        phoneBook.put("Мельник", "+380732345678");
        phoneBook.put("Шевченко", "+380972345678");
        phoneBook.put("Кравченко", "+380682345678");
        phoneBook.put("Бондаренко", "+380632345678");
        phoneBook.put("Ткаченко", "+380642345678");
        phoneBook.put("Гончаренко", "+380992345678");

        // Виведення всіх записів у телефонній книзі
        System.out.println("Телефонна книга:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Пошук номера телефону за прізвищем
        String searchName = "Мельник";
        if (phoneBook.containsKey(searchName)) {
            System.out.println("Номер телефону " + searchName + ": " + phoneBook.get(searchName));
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        // Видалення довільного запису
        String removeName = "Коваленко";
        if (phoneBook.containsKey(removeName)) {
            phoneBook.remove(removeName);
            System.out.println("Запис \"" + removeName + "\" видалено.");
        } else {
            System.out.println("Запис \"" + removeName + "\" не знайдено.");
        }

        // Виведення кількості записів у книзі
        System.out.println("Кількість записів у телефонній книзі: " + phoneBook.size());
    }
}
