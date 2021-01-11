package ru.geekbrains.lesson1;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        // step 2
        byte byteVar = -100;
        short shortVar = -10222;
        int intVar = 287736556;
        long longVar = 22222224455677L;
        float floatVar = 3.32f;
        double doubleVar = 4456.4456778;
        char charVar = '.';
        boolean blnVar = false;
        String strVar = "First variable";

        // step 3
        float a = 2.43f, b = 444.56f, c = 56.63f, d = 5.43f;
        System.out.println("Step 3 result:\n\t" + String.format("%f * (%f + (%f/%f)) = %f", a, b, c, d, calculateExpression(a, b, c, d)));

        // step 4
        System.out.println("Step 4 result:\n\t" + checkSumInRange(5, 16));

        // step 5
        int myNumber = 167;
        System.out.println("Step 5 result:\n\t" + myNumber + (isPositiveNumber(myNumber) ? " : Positive number" : " : Negative number"));
    }
    public static float calculateExpression(float a, float b, float c, float d){
        return a*(b+(c/d));
    }

    public static boolean checkSumInRange(int a, int b){
        return a+b>=10 && a+b<=20;
    }
    public static boolean isPositiveNumber(int var1){
        return var1 >= 0;
    }
}
