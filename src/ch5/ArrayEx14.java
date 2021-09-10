package ch5;

/**
 * Date   : 2021. 09. 10
 * Source : ArrayEx14.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ArrayEx14 {
    public static void main(String[] args) {

        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("src.charAt(" + i + "): " + ch);
        }

        // String을 char[]로 변환
        char[] chArr = src.toCharArray();

        // char배열(char[])을 출력
        System.out.println(chArr);
    }
}
