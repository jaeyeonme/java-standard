package ch9;

/**
 * Date   : 2021. 09. 20
 * Source : StringEx3.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class StringEx3 {
    public static void main(String[] args) {
        // 길이가 0인 char배열을 생성한다.
        char[] cArr = new char[0];     // char[] cArr = [];와 같다.
        String s = new String(cArr);   // String s = new String(""); 와 같다.

        System.out.println("cArr.length = " + cArr.length);
        System.out.println("@@@" + s + "@@@");
    }
}
