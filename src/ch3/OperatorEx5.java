package ch3;

/**
 * Date   : 2021. 08. 20
 * Source : OperatorEx5.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class OperatorEx5 {
    public static void main(String[] args) {

        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b);
        System.out.printf("%d / %f = %f\n", a, (float)b, a / (float)b);
    }
}
