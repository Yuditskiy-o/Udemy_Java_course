package Lesson_5;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;

    public Employee(int id, String surname, int age, int salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void doubleSalary() {
        double newSalary = salary * 2;
        System.out.println(newSalary);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Petrov", 25, 75000, "HR");
        Employee employee2 = new Employee(2, "Sidorov", 40, 150000, "Finance");

        employee1.doubleSalary();
        employee2.doubleSalary();
    }
}