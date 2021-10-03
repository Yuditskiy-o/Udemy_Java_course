package Lesson_6;

public class OverloadedExample {

    int sum() {
        int result = 0;
        System.out.println("Сумма равна "+ result);
        return result;
    }

    int sum(int a) {
        int result1 = a;
        System.out.println("Сумма равна "+ result1);
        return result1;
    }

    int sum(int b, int c) {
        int result2 = b + c;
        System.out.println("Сумма равна "+ result2);
        return result2;
    }

    int sum(int d, int e, int f) {
        int result3 = d + e + f;
        System.out.println("Сумма равна "+ result3);
        return result3;
    }

    void sum(int g, int h, int i, int j) {
        int result4 = g + h + i + j;
        System.out.println("Сумма равна "+ result4);
    }
}

class OverloadedExampleTest {

    public static void main(String[] args) {
        OverloadedExample oE = new OverloadedExample();

        oE.sum();
        oE.sum(1);
        oE.sum(1, 2);
        oE.sum(1, 2, 3);
        oE.sum(1, 2, 3, 4);
    }
}
