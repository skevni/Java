package ru.geekbrains.sklyarov.homework7;

public class MainApp {
    //    public static boolean thereIsHungryCats = false;
    public static void main(String[] args) {
        Plate plate = new Plate(24);
        plate.info();
        plate.fillMax();
        plate.info();

        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Пушок"),
                new Cat("Мурзик"),
                new Cat("Вася"),
                new Cat("Мурка")
        };
        for (Cat cat :
                cats) {
            cat.eat(plate);
            cat.info();
        }
        plate.info();
        System.out.println();

        plate.addFood(9);
        // для тестирования если остались голодные коты. Т.к. задания нет проверять все ли коты сыты, поэтому не
        // делал такую проверку
        for (Cat cat :
                cats) {
            cat.eat(plate);
            cat.info();
        }
        plate.info();
        System.out.println();

        Cat cat6 = new Cat("Семен");
        cat6.eat(plate);
        cat6.info();

        plate.info();
    }
}
