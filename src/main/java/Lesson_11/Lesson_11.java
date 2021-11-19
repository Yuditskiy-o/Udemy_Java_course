package Lesson_11;

public class Lesson_11 {

}

class Car {
    String color;
    String engine;
    int doorCount;

    public Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {

    void changeDoorCount(Car c, int doorCount) {
        c.doorCount = doorCount;
    }

    void changeColor(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car ("red", "v4", 2);
        Car car2 = new Car ("blue", "v8", 4);
        ct.changeDoorCount(car1,3);
        ct.changeColor(car1, car2);
        System.out.println("Первая машина: цвет — " + car1.color + ", мотор — " + car1.engine + ", " +
                "количество дверей — " + car1.doorCount);
        System.out.println("Вторая машина: цвет — " + car2.color + ", мотор — " + car2.engine + ", " +
                "количество дверей — " + car2.doorCount);
    }
}