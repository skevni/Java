package ru.geekbrains.sklyarov.homework6;

public abstract class AnimalSwim extends Animal{
    // constructor
    public AnimalSwim(String name){
        super(name);
    }

    protected abstract void swim(double obstacleLength);
}
