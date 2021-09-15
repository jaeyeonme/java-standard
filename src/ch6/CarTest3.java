package ch6;

/**
 * Date   : 2021. 09. 15
 * Source : CarTest3.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class CarTest3 {
    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c2 = new Car3();
        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

        c1.door = 100; // c1의 인스턴스변수 door의 값을 변경한다.
        System.out.println("c1.door = 100; 수행후");
        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

    }
}


class Car3 {
    String color;     // 색상
    String gearType;  // 변속기 종류 - auto(자동), manual(수동)
    int door;         // 문의 개수

    Car3() {
        this("white", "auto", 4);
    }

    Car3(Car3 c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car3(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}