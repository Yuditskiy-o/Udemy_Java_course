package Lesson_5;

public class Employee {
    int id;
    public String surname;
    public double salary;

    public Employee(int id2) {
        id = id2;
    }

    Employee(String surname2) {
        surname = surname2;
    }

    public Employee(double salary2) {
        salary = salary2;
    }

    double doubleSalary() {
        return salary * 2;
    }

    public void getID() {
        System.out.println("ID = " + id);
    }

    public void getSurname() {
        System.out.println("Surname = " + surname);
    }

    public void getSalary() {
        System.out.println("Salary = " + salary);
    }
}