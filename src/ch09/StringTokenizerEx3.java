package ch09;

import java.util.StringTokenizer;

/**
 * Date   : 2021. 09. 20
 * Source : StringTokenizerEx3.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class StringTokenizerEx3 {
    public static void main(String[] args) {
        String source = "1, 김천재, 100, 100, 10012, 박수재, 95, 80, 9013, 이자바, 80, 90, 90";
        StringTokenizer st = new StringTokenizer(source, "|");

        while (st.hasMoreTokens()) {
            String token = st.nextToken();

            StringTokenizer st2 = new StringTokenizer(token, ",");
            while (st2.hasMoreTokens())
                System.out.println(st2.nextToken());

            System.out.println("-------");
        }
    } // end of main
}
