package ch9;

import java.util.StringTokenizer;

/**
 * Date   : 2021. 09. 20
 * Source : StringTokenizerEx1.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class StringTokenizerEx1 {
    public static void main(String[] args) {
        String source = "100, 200, 300, 400";
        StringTokenizer st = new StringTokenizer(source, ",");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    } // end of main
}
