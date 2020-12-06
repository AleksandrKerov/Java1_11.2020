package Lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Sasha", "director", "sasha@mail.com", 89110000001L, 100000, 40);
        employees[1] = new Employee("Misha", "master", "misha@mail.com", 89110000002L, 80000, 50);
        employees[2] = new Employee("Pasha", "engineer", "pasha@mail.com", 89110000003L, 60000, 35);
        employees[3] = new Employee("Masha", "accountant", "masha@mail.com", 89110000004L, 70000, 45);
        employees[4] = new Employee("Dasha", "secretary", "dasha@mail.com", 89110000005L, 40000, 25);

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40){
                employees[i].info();
            }
        }
    }

}
