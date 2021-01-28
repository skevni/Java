package ru.geekbrains.sklyarov.lesson4;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static int SIZE = 52;
    public static int CHIPS_TO_WIN = 4;
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
        } while (isNotEmpty(x, y));
        map[x][y] = CHIP_HUMAN;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (isNotEmpty(x, y));
        map[x][y] = CHIP_AI;
        System.out.println("Искуственный интеллект походил x=" + (x + 1) + ", y=" + (y + 1));
        System.out.println();
    }

    public static boolean checkWin(char player) {
        // без смещения диагоналей
        int horizontalLine, verticalLine, diagonalUp, diagonalDown;
        horizontalLine = verticalLine = diagonalUp = diagonalDown = 0;

        for (int k = (SIZE - CHIPS_TO_WIN) * -1; k <= SIZE - CHIPS_TO_WIN; k++) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (j - k < -1 || j + k > SIZE || j - k > SIZE || j + k < -1) {
                        continue;
                    }
                    if (map[j][i] == player) {
                        if (i == j - k) {
                            // диагональ слева на право, сверху вниз
                            diagonalDown++;
                        }
                        if (i == SIZE - j - k - 1) {
                            // диагональ слева на право, cнизу вверх
                            diagonalUp++;
                        }
                        // горизонталь проверяем без смещения
                        if (++horizontalLine >= CHIPS_TO_WIN && k == 0) {
                            System.out.println("Horizontal");
                            return true;
                        }
                        if (diagonalUp >= CHIPS_TO_WIN || diagonalDown >= CHIPS_TO_WIN) {
                            return true;
                        }
//                        if (diagonalUp >= CHIPS_TO_WIN) {
//                            System.out.println("Диагональ вверх");
//                        }
//                        if (diagonalDown >= CHIPS_TO_WIN) {
//                            System.out.println("Диагональ вниз");
//                        }

                    } else {
                        if (k == 0) {
                            horizontalLine = 0;
                        }
                        if (i == j - k) {
                            // диагональ слева на право, сверху вниз
                            diagonalDown = 0;
                        }
                        if (i == SIZE - j - k - 1) {
                            // диагональ слева на право, cнизу вверх
                            diagonalUp = 0;
                        }
                    }
                    // вертикаль проверяем без смещения
                    if (k == 0) {
                        if (map[i][j] == player) {
                            if (++verticalLine >= CHIPS_TO_WIN) {
//                                System.out.println("Vertical");
                                return true;
                            }
                        } else {
                            verticalLine = 0;
                        }
                    }

                }
                horizontalLine = 0;
                verticalLine = 0;
            }
            diagonalDown = 0;
            diagonalUp = 0;
        }
        return false;
    }

    public static boolean isNotEmpty(int x, int y) {
        if (x >= map.length || y>= map.length){
            return true;
        }
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
