package seminar1;

public class Task2 {

    public static void main(String[] args) {
        // Примеры вызова методов
        System.out.println("Сумма 10 и 5: " + sum(10, 5));
        System.out.println("Разность 10 и 5: " + subtract(10, 5));
        System.out.println("10 в степени 3: " + power(10, 3));
        printMultiplicationTable(5);
    }

    // Метод для сложения двух чисел
    public static int sum(int a, int b) {
        return a + b;
    }

    // Метод для вычитания двух чисел
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Метод для возведения числа в степень
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // Метод для вывода таблицы умножения на конкретное число
    public static void printMultiplicationTable(int number) {
        System.out.println("Таблица умножения для числа " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
