package ru.geekbrains.sklyarov.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry; // по умолчанию false


    public Cat(String name) {
        this.name = name;
        this.appetite = 5;
        this.hungry = true;
    }

    public String getName() {
        return name;
    }

    public boolean isFullOfFood() {
        return !hungry;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            hungry = false; // сытый
        }
    }
}
