package ch09;

import java.math.BigInteger;

/**
 * Date   : 2021. 09. 20
 * Source : BigIntegerEx.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class BigIntegerEx {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 100; i++) {
            System.out.printf("%d != %s\n", i, calcFactorial(i));
            Thread.sleep(300);  // 0.3초의 지연
        }
    }

    static String calcFactorial(int n) {
        return factorial(BigInteger.valueOf(n)).toString();
    }

    static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
