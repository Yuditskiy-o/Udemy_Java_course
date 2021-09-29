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

    int doubleSalary() {
        return salary * 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Петров", 25, 75000, "HR");
        Employee employee2 = new Employee(2, "Сидоров", 40, 150000, "Finance");

        employee1.doubleSalary();
        System.out.println("Новая зарплата " + employee1.surname + "а равна " + employee1.doubleSalary() + ".");

        employee2.doubleSalary();
        System.out.println("Новая зарплата " + employee2.surname + "а равна " + employee2.doubleSalary() + ".");
    }
}