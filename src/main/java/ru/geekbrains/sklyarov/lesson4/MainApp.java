package ru.geekbrains.sklyarov.lesson4;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static int SIZE = 3;
    public static int CHIPS_TO_WIN = 3;
    public static final char CHIP_HUMAN = 'X';
    public static final char CHIP_AI = '0';
    public static final char EMPTY_FIELD = '*';

    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
//        String str = getSpaces(5);
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(CHIP_HUMAN)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isGameDraw()) {
                System.out.println("Игра закончилась с ничейным результатом.");
                break;
            }
            // AI
            aiTurn();
            printMap();
            if (checkWin(CHIP_AI)) {
                System.out.println("Победил искусственный интеллект");
                break;
            }
            if (isGameDraw()) {
                System.out.println("Игра закончилась с ничейным результатом.");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_FIELD;
            }
        }
    }

    public static void printMap() {
    /*
    При обходе массива сначала выбираем строку. Но т.к. строки идут одна под одной, то это ось Y
    После выбора строки пробегаемся по каждому столбцу. Они идут рядом (друг за другом) значит это ось Х
     */
        for (int i = 0; i <= SIZE; i++) {
            System.out.print((i == 0 ? " " : i) + "   ");
        }
        System.out.println();
        for (int y = 0; y < SIZE; y++) {
            System.out.print(y + 1 + "   ");
            for (int x = 0; x < SIZE; x++) {
                System.out.print(map[x][y] + "   ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        System.out.println("Выберите место на поле для хода в формате \"x y\"\nГде x - это число по горизонтали, " +
                "у - по вертикали");
        int x, y;
        do {
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isEmpty(x, y));
        map[x][y] = CHIP_HUMAN;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (isEmpty(x, y));
        map[x][y] = CHIP_AI;
        System.out.println("Искуственный интеллект походил x=" + (x + 1) + ", y=" + (y + 1));
        System.out.println();
    }

    public static boolean checkWin(char player) {
        // Только для поля 3 х 3
        int horizontalLine, verticalLine, diagonalUp, diagonalDown;
        horizontalLine = verticalLine = diagonalUp = diagonalDown = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == player) {
                    if (i == j) {
                        // диагональ слева на право, сверху вниз
                        diagonalDown++;
                    }
                    if (i == SIZE - j - 1) {
                        // диагональ слева на право, cнизу вверх
                        diagonalUp++;
                    }
                    if (++horizontalLine == CHIPS_TO_WIN) {
                        return true;
                    }
                }
                if (map[i][j] == player) {
                    if (++verticalLine == CHIPS_TO_WIN) {
                        return true;
                    }
                }
            }
            horizontalLine = 0;
            verticalLine = 0;
        }
        return diagonalUp == CHIPS_TO_WIN || diagonalDown == CHIPS_TO_WIN;
    }

    public static boolean isEmpty(int x, int y) {
        return map[x][y] != EMPTY_FIELD;
    }

    /*
    Метод проверки на ничью, когда нет ходов
     */
    public static boolean isGameDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_FIELD) {
                    return false;
                }
            }
        }
        return true;
    }
}
