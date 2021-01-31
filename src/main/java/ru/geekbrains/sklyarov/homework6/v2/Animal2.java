package ru.geekbrains.sklyarov.homework6.v2;

public abstract class Animal2 {
    private String name, color;
    private float age;
    private double obstacleLength;

    /*
        Constructors
     */
    public Animal2(String name) {
        this.name = name;
    }

    /*
        Setters and Getters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        if (age>0) {
            this.age = age;
        }
    }

    public double getObstacleLength() {
        return obstacleLength;
    }

    public void setObstacleLength(double obstacleLength) {
        if (obstacleLength>=0){
            this.obstacleLength = obstacleLength;
        }
    }

    /*
        Methods
     */
    protected abstract void run(double obstacleLength);

    protected int getCount(Animal2[] animals){
        int count = 0;
        for (Animal2 a :
                animals) {
            count++;
        }
        return count;
    }
}
