package ch09;

import java.util.StringJoiner;

/**
 * Date   : 2021. 09. 20
 * Source : StringEx4.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class StringEx4 {
    public static void main(String[] args) {
        String animals = "dog, cat, bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr));

        StringJoiner sj = new StringJoiner("/", "[", "]");
        for (String s : arr)
            sj.add(s);

        System.out.println(sj.toString());
    }
}
