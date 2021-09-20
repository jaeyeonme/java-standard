package ch09;

import java.util.StringTokenizer;

/**
 * Date   : 2021. 09. 20
 * Source : StringTokenizerEx2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class StringTokenizerEx2 {
    public static void main(String[] args) {
        String expression = "x = 100 * (200 + 300) / 2";
        StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    } // end of main
}
