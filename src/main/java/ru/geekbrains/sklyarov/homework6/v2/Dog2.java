package ru.geekbrains.sklyarov.homework6.v2;


public class Dog2 extends AnimalSwim2 {
    private final static double MAX_OBSTACLE_RUN = 500;
    private final static double MAX_OBSTACLE_SWIM = 10;

    public Dog2(String name) {
        super(name);
    }

    @Override
    protected void run(double obstacleLength) {
        if (obstacleLength > 0 && obstacleLength <= MAX_OBSTACLE_RUN) {
            System.out.printf(super.getName() + " пробежал (-а) %f м.\n", obstacleLength);
        } else {
            System.out.println("У собаки максимальное ограничение для бега: " + MAX_OBSTACLE_RUN + " м.");
        }
//        double catObstacleLength = super.getObstacleLength();
//        if (catObstacleLength > MAX_OBSTACLE_RUN) {
//            System.out.println("У собаки максимальное ограничение " + MAX_OBSTACLE_RUN + " м.");
//        } else {
//            System.out.printf(super.getName() + " пробежал (-а) %f м.\n", catObstacleLength);
//        }
    }

    @Override
    protected void swim(double obstacleLength) {
        if (obstacleLength > 0 && obstacleLength <= MAX_OBSTACLE_SWIM) {
            System.out.printf(super.getName() + " проплыл (-а) %f м.\n", obstacleLength);
        } else {
            System.out.println("У собаки максимальное ограничение для плавания: " + MAX_OBSTACLE_SWIM + " м.");
        }
    }

//    protected int getCount(Animal[] dogs) {
//        int count = 0;
//        for (Animal d :
//                dogs) {
//            if (d instanceof Dog) {
//                count++;
//            }
//        }
//        return count;
//    }
}
