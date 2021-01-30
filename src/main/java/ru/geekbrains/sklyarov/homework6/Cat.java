package ru.geekbrains.sklyarov.homework6;

public class Cat extends Animal{
    private final static double MAX_OBSTACLE_RUN = 200;
    public Cat(String name){
        super(name);
    }


    //    protected void run() {
//        double catObstacleLength = super.getObstacleLength();
//        if (catObstacleLength > MAX_OBSTACLE_LENGTH){
//            System.out.println("У собаки максимальное ограничение " + MAX_OBSTACLE_LENGTH + " м.");
//        } else {
//            System.out.printf(super.getName() + " пробежал (-а) %f м.\n", catObstacleLength);
//        }
//    }
    @Override
    protected void run(double obstacleLength) {
        if (obstacleLength > 0 && obstacleLength <= MAX_OBSTACLE_RUN){
            System.out.printf(super.getName() + " пробежал (-а) %f м.\n", obstacleLength);
        } else {
            System.out.println("У кошки максимальное ограничение для бега: " + MAX_OBSTACLE_RUN + " м.");
        }

    }
}
