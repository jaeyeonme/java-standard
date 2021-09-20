package ch09;

import static java.lang.Math.negateExact;
import static java.lang.System.out;

/**
 * Date   : 2021. 09. 20
 * Source : MathEx2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class MathEx2 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        out.println("i  = " + i);
        out.println("-i = " + (-i));

        try {
            out.printf("negateExact(%d) = %d\n", 10, negateExact(10));
            out.printf("negateExact(%d) = %d\n", -10, negateExact(-10));
            out.printf("negateExact(%d) = %d\n", i, negateExact(i));      // 예외발생
        } catch (ArithmeticException e) {
            // i를 long타입으로 형변환 다음에 negateExact(long a)를 호출
            out.printf("negateExact(%d) = %d\n", (long)i, negateExact((long)i));
        }
    } // end of main
}
