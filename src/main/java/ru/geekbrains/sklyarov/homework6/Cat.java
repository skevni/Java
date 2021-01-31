package ru.geekbrains.sklyarov.homework6;

public class Cat extends Animal{
    private final static double MAX_OBSTACLE_RUN = 200;
    public Cat(String name){
        super(name);
    }

    @Override
    protected void run(double obstacleLength) {
        if (obstacleLength > 0 && obstacleLength <= MAX_OBSTACLE_RUN){
            System.out.printf(super.getName() + " пробежал (-а) %f м.\n", obstacleLength);
        } else {
            System.out.println("У кошки максимальное ограничение для бега: " + MAX_OBSTACLE_RUN + " м.");
        }
    }
}
