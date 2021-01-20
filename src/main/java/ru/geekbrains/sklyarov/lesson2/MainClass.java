package ru.geekbrains.sklyarov.lesson2;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        // task 6
        System.out.println("Task 6");
        int[] arr6 = {-11, 3, 0, -9, 3, -2};
        System.out.println("Сумма левой и правой части равны:\n\t" + getArrayBalance(arr6));

        // task 7
        System.out.println("Task 7");
        int[] arr7 = {3, 5, 6, 1, 2, 4};
        System.out.println(Arrays.toString(arrayShift(arr7, -23)));

        // ОСТАЛЬНЫЕ ЗАДАНИЯ НА ВСЯКИЙ СЛУЧАЙ, ЕСЛИ ОШИБКИ В 6 И 7 ЗАДАНИЯХ

        //task 1.
        System.out.println("Task 1");
        setIntegerArray();

        // task 2.
        System.out.println("Task 2");
        setEmptyIntegerArray();

        // task 3.
        System.out.println("Task 3");
        multiplyNumberLess6();

        // task 4.
        System.out.println("Task 4");
        createTwoDimensionalIntegerArray();

        // task 5.
        System.out.println("Task 5");
        minAndMaxNumberInArray();



    }

    /*
    6.	** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    граница показана символами ||, эти символы в массив не входят.
     */
    public static boolean getArrayBalance(int[] arr) {
//        int[] arrLeft = new int[arr.length];
//        int[] arrRight = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            arrLeft[i] = arr[i] + (i == 0 ? 0 : arrLeft[i-1]);
//            arrRight[i] = arr[arr.length-1] + (i == 0 ? 0 : arrRight[i-1]);
//        }
//        for (int i = 0; i < arrLeft.length; i++) {
//            if (arrLeft[i] == arrRight[arrRight.length - i-1]) {
//                return true;
//            }
//        }
//        return false;
        int sumElements = 0;
        for (int el :
                arr) {
            sumElements += el;
        }
        // если число делится пополам с остатком, то левая и правая часть массива не могут быть равны
        if (sumElements % 2 == 0) {
            int accumulatedVar = 0;
            for (int j : arr) {
                accumulatedVar += j;
                if (accumulatedVar == (sumElements / 2)) {
                    return true;
                } else if (accumulatedVar > (sumElements / 2)) {
                    return false;
                }
            }
        }
        return false;
    }

    /*
    7.	**** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
    или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
    Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
    [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    При каком n в какую сторону сдвиг можете выбирать сами.
     */
    public static int[] arrayShift(int[] arr, int stepShift) {
        // нет сдвига или массив пустой
        if (stepShift == 0 || arr.length == 0) {
            return arr;
        }
        stepShift = stepShift % arr.length;
        // финт ушами, чтобы только сдвигаться права
        if (stepShift < 0) {
            stepShift += arr.length;
        }
        int tempNumber;
        for (int i = 0; i < stepShift; i++) {
            tempNumber = arr[arr.length - 1];
//            for (int j = arr.length - 1; j > 0; j--) {
//                arr[j] = arr[j - 1];
//            }
            System.arraycopy(arr, 0, arr, 1, arr.length - 1);
            arr[0] = tempNumber;
        }
        return arr;
    }

    /*
    1.	Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
            С помощью цикла и условия заменить 0 на 1, 1 на 0;
    */
    private static void setIntegerArray() {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

    /*
    2.	Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    */
    private static void setEmptyIntegerArray() {
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));
    }

    /*
    3.	Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    */
    public static void multiplyNumberLess6() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
    4.	Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
        цикла(-ов) заполнить его диагональные элементы единицами;
     */
    public static void createTwoDimensionalIntegerArray() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i == j || j == arr.length - i - 1) {
//                    arr[i][j] = 1;
//                }

//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
            arr[i][i] = 1;
            arr[i][arr.length -1 - i] = 1;
            System.out.println(Arrays.toString(arr[i]));
        }

    }

    /*
    5.	** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    */
    public static void minAndMaxNumberInArray() {
        int[] arr = {-1, 2, 0, -99, 33, 4, -10, 9, 57};
        int minNumber, maxNumber;
        minNumber = maxNumber = arr[0];

        for (int el :
                arr) {
            minNumber = Math.min(minNumber, el);
            maxNumber = Math.max(maxNumber, el);
        }
        System.out.println("Наименьшее число: " + minNumber);
        System.out.println("Наибольшее число: " + maxNumber);
    }


}
