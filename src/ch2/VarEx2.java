package ch2;

/**
 * Date   : 2021. 08. 12
 * Source : VarEx2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x: " + x + " y: " + y);
        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x: " + x + " y: " + y);
    }
}
