package ru.geekbrains.sklyarov.homework6;

public class Cat extends Animal {
    private static int catsCount = 0;
    public Cat(String name) {
        this.name = name;
        this.max_obstacle_run = 150;
        this.max_obstacle_swim = 0;
        catsCount++;
    }
    public int getCatsCount(){
        return catsCount;
    }

}
