package seminar1;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {10, 20, 5, 30, 15};

        // Вызов методов и вывод результатов
        System.out.println("Минимальное значение: " + findMin(array));
        System.out.println("Максимальное значение: " + findMax(array));
        printArray(array);
        reverseArray(array);
        System.out.println("Перевернутый массив:");
        printArray(array);

    }

    // Метод для нахождения минимального значения в массиве
    public static int findMin(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }


    // Метод для нахождения максимального значения в массиве
    public static int findMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Метод для печати массива
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Метод для переворота массива
    public static void reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
    }
}