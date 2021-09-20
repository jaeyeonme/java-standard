package ch03;

/**
 * Date   : 2021. 08. 21
 * Source : OperatorEx10.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class OperatorEx10 {
    public static void main(String[] args) {

        int a = 1000000;

        int result1 = a * a / a;  // 1000000 * 1000000 / 1000000
        int result2 = a / a * a;  // 1000000 / 1000000 * 1000000

        System.out.printf("%d * %d / %d = %d\n", a, a, a, result1);
        System.out.printf("%d / %d & %d = %d\n", a, a, a, result2);
    }
}
