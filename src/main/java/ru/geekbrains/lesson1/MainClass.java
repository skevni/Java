package ru.geekbrains.lesson1;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        /*  step 2
            Создать переменные всех пройденных типов данных и инициализировать их значения.
         */
        byte byteVar = -100;
        short shortVar = -10222;
        int intVar = 287736556;
        long longVar = 22222224455677L;
        float floatVar = 3.32f;
        double doubleVar = 4456.4456778;
        char charVar = '.';
        boolean blnVar = false;
        String strVar = "First variable";

        //  step 3
        float a = 2.43f, b = 444.56f, c = 56.63f, d = 5.43f;
        System.out.println("Step 3 result:\n\t" + String.format("%f * (%f + (%f/%f)) = %f", a, b, c, d,
                calculateExpression(a, b, c, d)));

        // step 4
        int step4FirstNumber = 5, step4SecondNumber = 13;
        System.out.println("Step 4. The sum of numbers " + step4FirstNumber + " and " + step4SecondNumber +
                " is in the range from 10 to 20?:\n\t" + checkSumInRange(step4FirstNumber, step4SecondNumber));

        // step 5
        // Т.к. в задании было написано, что в методе должен был выполнен вывод в консоль, поэтому написан метод
        // ничего не возвращающий.
        isPositiveOrNegative(-10);

        // step 6
        int myNumber = 167;
        System.out.println("Step 6. Is " + myNumber + " negative?:\n\t" + isNegativeNumber(myNumber));

        // step 7
        String myName = "Eugene";
        userGreeting(myName);

        // step 8
        short curYear = 1704;
        System.out.println("Step 6 result:\n\t " + curYear + (isLeapYear(curYear) ? " year is a leap year!" : " year is not a leap year!"));

    }

    /*  step 3
        Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        где a, b, c, d – аргументы этого метода, имеющие тип float.
    */
    public static float calculateExpression(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /*  step 4
        Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
        (включительно), если да – вернуть true, в противном случае – false.
    */
    public static boolean checkSumInRange(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    /*  step 5
        Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    */
    public static void isPositiveOrNegative(int intVar) {
        String strOut = "Step 5 result:\n\t" + intVar + " : " +
                (intVar >= 0 ? "positive" : "negative") + " number.";
        System.out.println(strOut);
    }

    /*  step 6
        Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
        отрицательное, и вернуть false если положительное.
    */
    public static boolean isNegativeNumber(int var1) {
        return var1 < 0;
    }

    /*  step 7
        Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в
        консоль сообщение «Привет, указанное_имя!».
    */
    public static void userGreeting(String userName) {
        System.out.println("Step 7 result:\n\tПривет, " + userName + "!");
    }

    /*  step 8
        Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    */
    public static boolean isLeapYear(short varYear) {
        if (varYear % 4 == 0) {
            if (varYear % 100 != 0) {
                return true;
            } else {
                return varYear % 400 == 0;
            }
        }
        return false;
    }
}
