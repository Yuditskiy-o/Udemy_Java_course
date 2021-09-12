package Lesson_4;

public class Student {
    int studentID;
    String name;
    String surname;
    int year;
    double averageRatingMath;
    double averageRatingEco;
    double averageRatingLang;
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.studentID = 1;
        student1.name = "Vasiliy";
        student1.surname = "Ivanov";
        student1.year = 2021;
        student1.averageRatingMath = 4.2;
        student1.averageRatingEco = 3.5;
        student1.averageRatingLang = 4.3;

        double finalAverage1 = (student1.averageRatingMath + student1.averageRatingEco + student1.averageRatingLang) / 3;

        System.out.println("Средняя оценка студента " + student1.name + " "
                + student1.surname + ", ID " + student1.studentID + ", " + student1.year +
                " года обучения: " + finalAverage1);

        student2.studentID = 2;
        student2.name = "Ivan";
        student2.surname = "Petrov";
        student2.year = 2021;
        student2.averageRatingMath = 4.1;
        student2.averageRatingEco = 3.6;
        student2.averageRatingLang = 4.3;

        double finalAverage2 = (student2.averageRatingMath + student2.averageRatingEco + student2.averageRatingLang) / 3;

        System.out.println("Средняя оценка студента " + student2.name + " "
                + student2.surname + ", c ID " + student2.studentID + ", " + student2.year +
                " года обучения: " + finalAverage2);

        student3.studentID = 3;
        student3.name = "Sergey";
        student3.surname = "Sidorov";
        student3.year = 2021;
        student3.averageRatingMath = 4.1;
        student3.averageRatingEco = 4.0;
        student3.averageRatingLang = 4.5;

        double finalAverage3 = (student3.averageRatingMath + student3.averageRatingEco + student3.averageRatingLang) / 3;

        System.out.println("Средняя оценка студента " + student3.name + " "
                + student3.surname + ", c ID " + student3.studentID + ", " + student3.year +
                " года обучения: " + finalAverage3);
    }
}
