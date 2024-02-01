package seminar1;

public class Task1 {
    public static void main(String[] args) {
        // int - целочисленный тип данных, используется для хранения целых чисел
        int a = 10;
        int b = 5;

        // Математические операции с использованием int
        System.out.println("Сложение: " + (a + b)); // сложение двух целых чисел
        System.out.println("Вычитание: " + (a - b)); // вычитание двух целых чисел
        System.out.println("Умножение: " + (a * b)); // умножение двух целых чисел
        System.out.println("Деление: " + (a / b)); // деление двух целых чисел

        // double - тип данных с плавающей точкой, используется для более точных и сложных вычислений
        double c = 2.5;
        double d = 1.5;

        // Математические операции с использованием double
        System.out.println("Сложение (double): " + (c + d)); // сложение двух чисел с плавающей точкой
        System.out.println("Вычитание (double): " + (c - d)); // вычитание двух чисел с плавающей точкой

        // Пример использования условного оператора if-else
        if (a > b) {
            System.out.println("a больше b"); // условие истинно, если a больше b
        } else {
            System.out.println("a меньше или равно b"); // иначе, если a меньше или равно b
        }

        // Пример цикла for
        System.out.println("Цикл for от 1 до 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i); // печатает числа от 1 до 5
        }

        // Пример цикла while
        System.out.println("Цикл while: отсчет от 5 до 1");
        int count = 5; // начальное значение счетчика
        while (count > 0) {
            System.out.println(count); // печатает текущее значение счетчика
            count--; // уменьшает значение счетчика на 1
        }

        // boolean - логический тип данных, принимает значения true или false
        boolean isEven = a % 2 != 0; // проверяет, является ли число a четным
        System.out.println("Число a четное: " + isEven);

        // char - тип данных для хранения одиночного символа
        char letter = 'A';
        System.out.println("Символ: " + letter);
    }
}