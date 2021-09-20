package ch07;

/**
 * Date   : 2021. 09. 17
 * Source : BindingTest.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class BindingTest {
    public static void main(String[] args) {
        Child3 p = new Child3();
        Child3 c = new Child3();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();

    }
}

class Parent3 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child3 extends Parent3 {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}
