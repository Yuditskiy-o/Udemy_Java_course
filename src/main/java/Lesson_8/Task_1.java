package Lesson_8;

public class Task_1 {

    static double result(double a, double b, double c) {
        return a * b * c;
    }

    static void result2 (int a, int b) {
        System.out.println("Целое число в результате деления: " + a / b + ", остаток от деления: " + a % b);
    }
}

class Task_1_test {

    public static void main(String[] args) {
        System.out.println(Task_1.result(2, 3, 4));
        Task_1.result2(5, 3);
        System.out.println(Task_1.result(2.4, 3.2, 4.5));
        Task_1.result2(12, 5);
    }
}
