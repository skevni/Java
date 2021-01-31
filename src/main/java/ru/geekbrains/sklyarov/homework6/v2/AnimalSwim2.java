package ru.geekbrains.sklyarov.homework6.v2;

public abstract class AnimalSwim2 extends Animal2 {
    // constructor
    public AnimalSwim2(String name){
        super(name);
    }

    protected abstract void swim(double obstacleLength);
}
