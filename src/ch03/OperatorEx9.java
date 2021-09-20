package ch03;

/**
 * Date   : 2021. 08. 21
 * Source : OperatorEx9.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class OperatorEx9 {
    public static void main(String[] args) {

        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;

        System.out.println(a);
        System.out.println(b);
    }
}
