package Lesson_5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1);
        Employee employee2 = new Employee("Ivanov");
        Employee employee3 = new Employee(15.000);

        System.out.println(employee1.id);
        System.out.println(employee2.surname);
        System.out.println(employee3.salary);

        employee1.getID();
        employee1.getSurname();
        employee1.getSalary();

        employee2.getID();
        employee2.getSurname();
        employee2.getSalary();

        employee3.getID();
        employee3.getSurname();
        employee3.getSalary();
    }
}
