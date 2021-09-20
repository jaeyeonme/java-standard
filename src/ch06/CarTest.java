package ch06;


/**
 * Date   : 2021. 09. 15
 * Source : CarTest.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class Car {
    String color;      // 색상
    String gearType;   // 변속기 종류 - auto(자동), manul(수동)
    int door;          // 문의 개수

    Car() {}

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4);
        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}
