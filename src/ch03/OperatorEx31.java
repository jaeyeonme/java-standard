package ch03;

/**
 * Date   : 2021. 08. 24
 * Source : OperatorEx31.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class OperatorEx31 {
    public static void main(String[] args) {
        int dec		= 1234;
        int hex		= 0xABCD;
        int mask	= 0xF;

        System.out.printf("hex=%X%n", hex);
        System.out.printf("%X%n", hex&mask);

        hex = hex >> 4;
        System.out.printf("%X%n", hex&mask);

        hex = hex >> 4;
        System.out.printf("%X%n", hex&mask);

        hex = hex >> 4;
        System.out.printf("%X%n", hex&mask);
    }	// main의 끝
}
