package ru.geekbrains.sklyarov.homework6;

public abstract class Animal {
    String name, type;
    private static int animalCount = 0;
    double max_obstacle_run;
    double max_obstacle_swim;

    /*
        Constructors
     */
    public Animal() {
        animalCount++;
    }
    /*
    Getter
     */
    public static int getCount() {
        return animalCount;
    }

    /*
        Methods
     */
    protected void run(double obstacleLength) {
        if (max_obstacle_run == 0){
            System.out.println(type + " " + name + " не умеет бегать!");
        }
        if (obstacleLength <= max_obstacle_run) {
            System.out.printf("%s %s пробежал %f м.\n", type,name, obstacleLength);
        } else {
            System.out.printf("%s %s может пробежать максимум %f м.\n", type,name, max_obstacle_run);
        }
    }
    protected void swim(double obstacleLength) {
        if (max_obstacle_swim == 0){
            System.out.println(type + " " + name + " не умеет плавать!");
            return;
        }
        if (obstacleLength <= max_obstacle_swim) {
            System.out.printf("%s %s проплыл %f м.\n", type,name, obstacleLength);
        } else {
            System.out.printf("%s %s не может проплыть %f м.\n", type,name, max_obstacle_swim);
        }
    }

}
