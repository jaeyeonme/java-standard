package ch07;

/**
 * Date   : 2021. 09. 18
 * Source : InnerEx6.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class InnerEx6 {
    Object iv = new Object() { void method() {} };         // 익명 클래스
    static Object cv = new Outer() { void method() {} };   // 익명 클래스

    void myMethod() {
        Object lv = new Object() { void method() {} };     // 익명 클래스
    }
}
