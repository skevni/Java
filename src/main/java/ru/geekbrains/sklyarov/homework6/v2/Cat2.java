package ru.geekbrains.sklyarov.homework6.v2;

public class Cat2 extends Animal2 {
    private final static double MAX_OBSTACLE_RUN = 200;
    public Cat2(String name){
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

    protected int getCount(Animal2[] cats){
        int count = 0;
        for (Animal2 c :
                cats) {
            if (c instanceof Cat2) {
                count++;
            }
        }
        return count;
    }
}
