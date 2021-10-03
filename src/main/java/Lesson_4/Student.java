package Lesson_4;

public class Student {
    int studentID;
    String name;
    String surname;
    int year;
    double averageRatingMath;
    double averageRatingEco;
    double averageRatingLang;

    public Student(int studentID1, String name1, String surname1, int year1, double averageRatingMath1,
                   double averageRatingEco1, double averageRatingLang1) {
        studentID = studentID1;
        name = name1;
        surname = surname1;
        year = year1;
        averageRatingMath = averageRatingMath1;
        averageRatingEco = averageRatingEco1;
        averageRatingLang = averageRatingLang1;
    }

    Student(int studentID2, String name2, String surname2, int year2) {
        this(studentID2, name2, surname2, year2, 0, 0, 0);
    }

    Student() {
    }

    void viewInfo() {
        double finalAverage = (averageRatingMath + averageRatingEco + averageRatingLang) / 3;

        System.out.println("Средняя оценка студента " + name + " " + surname + ", ID " + studentID + ", "
                + year + " года обучения: " + finalAverage);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Ivan", "Petrov", 2021, 4.2,
                3.5, 4.1);
        st1.viewInfo();

        Student st2 = new Student(2, "Vladimir", "Sidorov", 2021);
        st2.averageRatingMath = 4.2;
        st2.averageRatingEco = 4.1;
        st2.averageRatingLang = 4.0;
        st2.viewInfo();

        Student st3 = new Student(3, "Anton", "Alekseev", 2021, 4.1,
                3.9, 4.1);
        st3.viewInfo();
    }
}
