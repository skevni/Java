package ru.geekbrains.sklyarov.homework5;

public class Employee {
    private String family, position, email, phone;
    private int age;
    private float salary;

    public int getAge(){
        return this.age;
    }

    public Employee(String family, String position, String email, String phone, float salary, int age){
        this.family = family;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Фамилия:" + family + "\nДолжность:" + position + "\nemail:" + email + "\nТелефон:"
        + phone + "\nЗарплата:" + salary + "\nВозраст:" + age );
    }

}
