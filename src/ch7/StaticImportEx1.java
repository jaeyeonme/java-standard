package ch7;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.System.out;

/**
 * Date   : 2021. 09. 16
 * Source : StaticImportEx1.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class StaticImportEx1 {
    public static void main(String[] args) {
        // System.out.println(Math.random());
        out.println(random());

        // System.out.println("Math.PI :" + Math.PI);
        out.println("Math.PI : " + PI);
    }
}
