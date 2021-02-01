package ru.geekbrains.sklyarov.homework6;

public abstract class Animal {
    String name;
    private static int animalCount = 0;
    double max_obstacle_run;
    double max_obstacle_swim;

    /*
        Constructors
     */
    public Animal() {
        animalCount++;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    /*
        Methods
     */
    protected void run(double obstacleLength) {
        if (max_obstacle_run == 0){
            System.out.println(name + " не умеет бегать!");
        }
        if (obstacleLength <= max_obstacle_run) {
            System.out.printf("%s пробежал %f м.\n", name, obstacleLength);
        } else {
            System.out.printf("%s может пробежать максимум %f м.\n", name, max_obstacle_run);
        }
    }
    protected void swim(double obstacleLength) {
        if (max_obstacle_swim == 0){
            System.out.println(name + " не умеет плавать!");
            return;
        }
        if (obstacleLength <= max_obstacle_swim) {
            System.out.printf("%s проплыл %f м.\n", name, obstacleLength);
        } else {
            System.out.printf("%s не может проплыть %f м.\n", name, max_obstacle_swim);
        }
    }

}
