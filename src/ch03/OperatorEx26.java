package ch03;

/**
 * Date   : 2021. 08. 24
 * Source : OperatorEx26.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class OperatorEx26 {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        System.out.printf("a = %d, b = %d\n", a, b);
        System.out.printf("a != 0 || ++b != 0 = %b\n", a != 0 || ++b != 0);
        System.out.printf("a = %d, b = %d\n", a, b);
        System.out.printf("a == 0 && ++b != 0 = %b\n", a == 0 && ++b != 0);
        System.out.printf("a = %d, b = %d\n", a, b);

    }
}
