package Lesson_4;

public class Student {
    int studentID;
    String name;
    String surname;
    int year;
    double averageRatingMath;
    double averageRatingEco;
    double averageRatingLang;

    void viewInfo() {
        double finalAverage = (averageRatingMath + averageRatingEco + averageRatingLang) / 3;

        System.out.println("Средняя оценка студента " + name + " " + surname + ", ID " + studentID + ", "
                + year + " года обучения: " + finalAverage);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentID = 1;
        st1.name = "Vasiliy";
        st1.surname = "Ivanov";
        st1.year = 2021;
        st1.averageRatingMath = 4.2;
        st1.averageRatingEco = 3.5;
        st1.averageRatingLang = 4.3;
        st1.viewInfo();

        Student st2 = new Student();
        st2.studentID = 2;
        st2.name = "Ivan";
        st2.surname = "Petrov";
        st2.year = 2021;
        st2.averageRatingMath = 4.1;
        st2.averageRatingEco = 3.6;
        st2.averageRatingLang = 4.3;
        st2.viewInfo();

        Student st3 = new Student();
        st3.studentID = 3;
        st3.name = "Sergey";
        st3.surname = "Sidorov";
        st3.year = 2021;
        st3.averageRatingMath = 4.1;
        st3.averageRatingEco = 4.0;
        st3.averageRatingLang = 4.5;
        st3.viewInfo();
    }
}
