package ch07;

/**
 * Date   : 2021. 09. 17
 * Source : BindingTest2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class BindingTest2 {
    public static void main(String[] args) {
        Child4 p = new Child4();
        Child4 c = new Child4();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent4 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child4 extends Parent4 {}
