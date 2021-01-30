package ru.geekbrains.sklyarov.homework6;

public class MainApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Барсик");
//        cat.setObstacleLength(200);
        cat.run(155.86);
        Dog dog = new Dog("Шарик");
        dog.run(550);
        dog.swim(9.5);

    }
}
