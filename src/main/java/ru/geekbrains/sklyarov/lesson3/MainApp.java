package ru.geekbrains.sklyarov.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        guessWord(words);
    }

    /*
    * Создать массив из слов
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
    "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
    "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
     */
    public static void guessWord(String[] words) {

        if (words.length == 0) {
            return;
        }
        // читаем ввод
        Scanner sc = new Scanner(System.in);
        // генерируем случайное число в границах от 0 до правой границы массива(исключительно)
        // поэтому рандомная правая граница никогда не превысит размер массива
        Random objRandom = new Random();
        String hiddenWord = words[objRandom.nextInt(words.length)];

        String userWord;
        String message = "Загадано слово из следующего списка " + Arrays.toString(words) + ".\nПопробуй отгадай. " +
                "Введите ваш ответ...";
        while (true) {
            System.out.println(message);
            userWord = sc.nextLine();
            if (!hiddenWord.equalsIgnoreCase(userWord)) {
                message = "Вы не угадали слово, попробуйте еще раз."; // Осталось " + (maxCounter - currentCounter) + " попыток.";
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
                sc.close();
                break;
            }
        }
    }
}
