package ch6;

/**
 * Date   : 2021. 09. 13
 * Source : FactorialTest.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);
    }

    static int factorial(int n) {
        int result = 0;

        if (n == 1)
            result = 1;
        else
            result = n * factorial(n - 1);  // 다시 메소드 자신을 호출한다.

        return result;
    }
}
