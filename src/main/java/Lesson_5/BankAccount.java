package Lesson_5;

public class BankAccount {
    int id;
    String name;
    double balance;

    void increaseBalance() {
        double sum = balance + 50.00;
        System.out.println("У клиента " + name + "а с ID " + id + " текущий остаток по карте равен " + sum);
    }

    void decreaseBalance() {
        double sum = balance - 50.00;
        System.out.println("У клиента " + name + "а с ID " + id + " текущий остаток по карте равен " + sum);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bA1 = new BankAccount();
        BankAccount bA2 = new BankAccount();

        bA1.id = 1;
        bA1.name = "Олег";
        bA1.balance = 100.00;
        bA1.increaseBalance();

        bA2.id = 2;
        bA2.name = "Владимир";
        bA2.balance = 150.50;
        bA2.decreaseBalance();
    }
}