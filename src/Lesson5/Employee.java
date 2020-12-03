package Lesson5;

public class Employee {
    String name;
    String position;
    String email;
    long phone;
    int salary;
    int age;

    public Employee(String name, String position, String email, long phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void info(){
        System.out.printf("Employee: %s, %s, %s, %d, %d, %d\n", name, position, email, phone, salary, age);
    }

    public int getAge() {
        return age;
    }
}
