package ru.geekbrains.sklyarov.homework6;

public class Dog extends AnimalSwim {
    private final static double MAX_OBSTACLE_RUN = 500;
    private final static double MAX_OBSTACLE_SWIM = 10;

    public Dog(String name) {
        super(name);
    }

    @Override
    protected void run(double obstacleLength) {
        if (obstacleLength > 0 && obstacleLength <= MAX_OBSTACLE_RUN) {
            System.out.printf(super.getName() + " пробежал (-а) %f м.\n", obstacleLength);
        } else {
            System.out.println("У собаки максимальное ограничение для бега: " + MAX_OBSTACLE_RUN + " м.");
        }
    }

    @Override
    protected void swim(double obstacleLength) {
        if (obstacleLength > 0 && obstacleLength <= MAX_OBSTACLE_SWIM) {
            System.out.printf(super.getName() + " проплыл (-а) %f м.\n", obstacleLength);
        } else {
            System.out.println("У собаки максимальное ограничение для плавания: " + MAX_OBSTACLE_SWIM + " м.");
        }
    }
}
