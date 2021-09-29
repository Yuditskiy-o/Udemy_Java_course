package Lesson_5;

public class BankAccount {
    int id = 1;
    String name = "Олег";
    int balance = 150;

    void increaseBalance(int payment) {
        int sum = balance + payment;
        System.out.println("У " + name + "а с ID " + id + " текущий остаток по карте равен " + sum);
    }

    void decreaseBalance(int payment) {
        int sum = balance - payment;
        System.out.println("У " + name + "а с ID " + id + " текущий остаток по карте равен " + sum);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();

        bA.increaseBalance(50);
        bA.decreaseBalance(50);
    }
}