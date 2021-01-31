package ru.geekbrains.sklyarov.homework6;

public class MainApp {
    public static void main(String[] args) {
        // version 2
        // tasks 1-3
        Cat cat = new Cat("Барсик");

        cat.setObstacleLength(200);
        cat.run(155.86);

        Dog dog = new Dog("Шарик");
        dog.run(550);
        dog.swim(9.5);

        // task 4*
        Animal[] animals = {
                new Cat("Барсик"),
                new Cat("Персик"),
                new Cat("Дымок"),
                new Dog("Шарик"),
                new Dog("Рэкс")

        };

        int cats = 0, dogs = 0;
        System.out.println( "Всего животных: " + animals.length);
        for (Animal a :
                animals) {
            if (a instanceof Cat){
                cats++;
            }
            if (a instanceof Dog){
                dogs++;
            }
        }
        System.out.println( "Котов: " + cats);
        System.out.println( "Собак: " + dogs);

    }
}
