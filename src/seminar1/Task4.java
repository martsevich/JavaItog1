package seminar1;

import java.util.Arrays;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 2, 5};

        // Сортировка массива
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
        // Arrays.sort() сортирует массив на месте, изменяя порядок элементов.

        // Поиск в массиве
        int index = Arrays.binarySearch(array, 6);
        System.out.println("Индекс элемента 6: " + index);
        // Arrays.binarySearch() выполняет двоичный поиск указанного значения в массиве.
        // Массив должен быть отсортирован перед вызовом этого метода.

        // Сравнение массивов
        int[] arrayCopy = {10, 4, 6, 2, 5};
        Arrays.sort(arrayCopy);
        boolean areEqual = Arrays.equals(array, arrayCopy);
        System.out.println("Массивы равны: " + areEqual);
        // Arrays.equals() сравнивает два массива на равенство.

        // Заполнение массива
        int[] newArray = new int[5];
        Arrays.fill(newArray, 7);
        System.out.println("Массив, заполненный 7: " + Arrays.toString(newArray));
        // Arrays.fill() заполняет массив заданным значением.

        // Копирование массива
        int[] arrayCopy2 = Arrays.copyOf(array, array.length);
        System.out.println("Копия массива: " + Arrays.toString(arrayCopy2));
        // Arrays.copyOf() создает новый массив, являющийся копией исходного массива.

        // Преобразование списка в массив
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] listArray = list.toArray(new Integer[0]);
        System.out.println("Список преобразован в массив: " + Arrays.toString(listArray));
        // Arrays.asList() преобразует массив в список, а list.toArray() обратно в массив.

        // Многомерные массивы
        int[][] multiArray = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Многомерный массив: " + Arrays.deepToString(multiArray));
        // Arrays.deepToString() используется для печати многомерных массивов.
    }
}