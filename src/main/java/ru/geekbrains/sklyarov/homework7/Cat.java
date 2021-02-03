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

//    public String getName() {
//        return name;
//    }

    public boolean isHungry() {
        return hungry;
    }

    public void eat(Plate plate) {
        if (hungry) {
            if (plate.decreaseFood(appetite)) {
                this.hungry = false; // сытый
            }
        }
    }

    public void info() {
        System.out.printf("%s - %s\n", name, (isHungry() ? "голоден (-на)" : "сытый (-ая)"));
    }
}
