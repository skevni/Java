package ru.geekbrains.sklyarov.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        // Task 2
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        guessWord(words);


        //  Task 1

        guessNumber(10, 3);


    }

    /* Task 2
    * Создать массив из слов
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
    "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
    "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
     */
    public static void guessWord(String[] words) {

        if (words.length == 0) {
            return;
        }

        // генерируем случайное число в границах от 0 до правой границы массива(исключительно)
        // поэтому рандомная правая граница никогда не превысит размер массива
        Random objRandom = new Random();
        String hiddenWord = words[objRandom.nextInt(words.length)];

        String userWord;
        String message = "Загадано слово из следующего списка " + Arrays.toString(words) + ".\nПопробуй отгадай. " +
                "Введите ваш ответ...";
        // читаем ввод
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(message);
            userWord = sc.nextLine();
            if (!hiddenWord.equalsIgnoreCase(userWord)) {
                message = "Вы не угадали слово, попробуйте еще раз."; // Осталось " + (maxCounter - currentCounter) + " попыток.";
                // Т.к. массив из 15 элементов, то не стал писать цикл.
                char[] guessedLetters = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
                for (int i = 0; i < hiddenWord.length(); i++) {
                    for (int j = 0; j < userWord.length(); j++) {
                        if (hiddenWord.charAt(i) == userWord.charAt(j)) {
                            guessedLetters[i] = hiddenWord.charAt(i);
                            break;
                        }
                    }
                }
                StringBuilder output = new StringBuilder();
                for (char letter :
                        guessedLetters) {
                    output.append(letter);
                }
                System.out.println("Есть совпадающие буквы: " + output);
            } else {
                System.out.println("Вы угадали! Это слово: " + hiddenWord);
                // если я в этом методе сканер закрываю, то в методе guessNumber
                // в строке 94 (userNumber = sc_1.nextInt();) ошибка
                // sc.close();
                break;
            }
        }
    }
    /*
    Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
    попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли
    указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
    выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */
    public static void guessNumber(int maxBound, int tries) {
        if (maxBound <= 0) {
            return;
        }
        int maxTries = tries;
        Random rd = new Random();
        int machineNumber = rd.nextInt(maxBound);
        String message = "Угадайте число от 0 до 9. У вас %d попытки!";
        Scanner sc = new Scanner(System.in);
        int userNumber;
        while (true) {
            System.out.printf(message + "\n", tries);
//            System.out.println();
            userNumber = sc.nextInt();
            if (machineNumber == userNumber) {
                System.out.printf("Вы выиграли! Было загадано число %d", machineNumber);
                System.out.println();
                break;
            } else {
                // Исчерпаны попытки, спросим продолжения
                if (--tries == 0){
                    System.out.println("Было загадано число " + machineNumber);
                    System.out.println("Повторить игру еще раз? 1 - ДА, 0 - НЕТ");
                    if (sc.nextInt() == 1) { // есть желание продолжить
                        tries = maxTries;
                        machineNumber = rd.nextInt(maxBound);
                        message = "Угадайте число от 0 до 9. У вас %d попытки!";
                    } else { // нет желания продолжать
                        sc.close();
                        return;
                    }
                } else {
                    message = "Вы не угадали! У вас осталось попыток: %d";
                }
            }
        }
    }
//    public static void printMessage(String mes, String... par) {
//
//    }
//    public static void printMessage(String mes, int... par) {
//        for (int valueParameter:
//             par) {
//            ;
//        }
//        System.out.println();
//    }
}
