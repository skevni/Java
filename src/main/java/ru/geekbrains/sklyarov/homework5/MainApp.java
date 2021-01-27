package ru.geekbrains.sklyarov.homework5;

public class MainApp {
    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Worker", "i.ivanov@company.com", "89990010000", 35000f, 22);
        employeeArray[1] = new Employee("Petrov Petr", "Engineer", "p.petrov@company.com", "89990010001", 75000f, 45);
        employeeArray[2] = new Employee("Sidorov Semen", "Programmer", "s.sidorov@company.com", "89990010002", 85000f, 35);
        employeeArray[3] = new Employee("Kuznetsov Panteliemon", "Engineer", "p.kuznetsov@company.com", "89990010003", 77000f, 41);
        employeeArray[4] = new Employee("Hohlov Petr", "Builder", "p.hohlov@company.com", "89990010004", 65000f, 33);

        for (Employee employee : employeeArray) {
            if (employee.getAge() > 40) {
                employee.printInfo();
                System.out.println("***********************************");
            }
        }

    }
}
