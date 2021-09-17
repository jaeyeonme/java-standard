package ch7;

/**
 * Date   : 2021. 09. 17
 * Source : CastingTest2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car;  // 8번째 줄 컴파일은 OK. 실행 시 에러가 발생
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
