package ch3;

/**
 * Date   : 2021. 08. 22
 * Source : OperatorEx11.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class OperatorEx11 {
    public static void main(String[] args) {

        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d\n", d, a, d - a);
        System.out.printf("'%c' - '%c' = %d\n", two, zero, two - zero);
        System.out.printf("'%c' = %d\n", a, (int)a);
        System.out.printf("'%c' = %d\n", zero, (int)zero);
        System.out.printf("'%c' = %d\n", two, (int)two);
    }
}
