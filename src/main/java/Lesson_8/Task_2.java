package Lesson_8;

public class Task_2 {

    public final static double PI = 3.14;

    public double square(double radius) {
        return PI * radius * radius;
    }

    public static double length(double radius2) {
        return 2 * PI * radius2;
    }

    public void info(double radius3) {
        System.out.println("Радиус = " + radius3);
        System.out.println("Площадь круга = " + square(radius3));
        System.out.println("Длина окружности = " + length(radius3));
    }
}

class Task_2_test {

    public static void main(String[] args) {
        Task_2 task_2 = new Task_2();
        task_2.square(3.2);
        Task_2.length(4.3);
        task_2.info(3.1);
    }
}
