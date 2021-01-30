package ru.geekbrains.sklyarov.homework6;

public abstract class Animal {
    private String name, color;
    private float age;
    private double obstacleLength;

    /*
        Constructors
     */
    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String color, float age) {
        this.name = name;
        this.color = color;
        this.age = age;
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


}
