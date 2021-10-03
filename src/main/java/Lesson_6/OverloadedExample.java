package Lesson_6;

public class OverloadedExample {

    void sum() {
        System.out.println("Нет параметров для вычисления, сумма равна 0");
    }

    void sum(int a) {
        System.out.println(a);
    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
}

class OverloadedExampleTest {

    public static void main(String[] args) {
        OverloadedExample oE = new OverloadedExample();
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        oE.sum();
        oE.sum(a);
        oE.sum(a, b);
        oE.sum(a, b, c);
        oE.sum(a, b, c, d);
    }
}
