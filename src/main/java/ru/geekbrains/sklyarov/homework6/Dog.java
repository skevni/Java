package ru.geekbrains.sklyarov.homework6;

public class Dog extends Animal{
    private static int dogsCount = 0;

    public Dog(String name) {
        this.name = name;
        this.max_obstacle_run = 500;
        this.max_obstacle_swim = 55;
        dogsCount++;
    }

    public int getDogsCount(){
        return dogsCount;
    }
}
