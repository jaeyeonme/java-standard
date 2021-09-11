package ch6;

/**
 * Date   : 2021. 09. 11
 * Source : CallStackTest.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class CallStackTest {
    public static void main(String[] args) {
        firstMethod();  // static 메소드는 객체 생성없이 호출가능하다.
    }

    static void firstMethod() {
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod");
    }
}
