package ru.geekbrains.sklyarov.homework7;

public class Plate {
    private int food;
    private int capacity;

    public Plate(int capacity) {
        this.capacity = capacity;
    }

    public void addFood(int food) {
        this.food += food;
    }

    public boolean decreaseFood(int amount){
        if (amount <= this.food) {
            this.food -= amount;
            return true;
        }
        return false;
    }
    public void fillMax(){
        food = capacity;
    }

    public void info(){
        System.out.printf("Plate: %d / %d\n", food, capacity);
    }
}
