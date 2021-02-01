package ru.geekbrains.sklyarov.homework7;

public class MainApp {
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
            System.out.printf("%s сытый (-ая): %b\n",cat.getName(), !cat.isHungry());
        }
        plate.info();
        System.out.println();
        plate.addFood(6);
        cats[cats.length-1].eat(plate);

        for (Cat cat :
                cats) {
            System.out.printf("%s сытый (-ая): %b\n",cat.getName(), !cat.isHungry());
        }
        plate.info();
        System.out.println();
        Cat cat6 = new Cat("Семен");
        cat6.eat(plate);
        System.out.printf("%s сытый (-ая): %b\n",cat6.getName(), !cat6.isHungry());
        plate.info();
    }
}
