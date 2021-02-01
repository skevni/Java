package ru.geekbrains.sklyarov.homework6;

public class MainApp {

    public static void main(String[] args) {
        Cat cat = new Cat("Пушок");
        Cat cat2 = new Cat("Персик");
        Dog dog = new Dog("Тузик");
        Dog dog2 = new Dog("Шарик");

        cat.run(59);
        dog.run(345);
        cat2.swim(10);
        cat2.run(55);
        dog2.run(566);
        dog2.swim(15);
    }
}
