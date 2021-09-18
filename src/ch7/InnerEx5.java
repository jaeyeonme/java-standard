package ch7;

/**
 * Date   : 2021. 09. 18
 * Source : InnerEx5.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class Outer2 {
    int value = 10;      // Outer.this.value

    class Inner {
        int value = 20; // this.value

        void method1() {
            int value = 30;
            System.out.println("           value : " + value);
            System.out.println("      this.value : " + this.value);
            System.out.println("Outer.this.value : " + Outer2.this.value);
        }
    } // end of Inner
} // end of Outer

class InnerEx5 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer.new Inner();
        inner.method1();
    }
} // end of InnerEx5
