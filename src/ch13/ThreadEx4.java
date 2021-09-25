package ch13;

/**
 * Date   : 2021. 09. 25
 * Source : ThreadEx4.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ThreadEx4 {
    public static void main(String args[]) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++)
            System.out.printf("%s", new String("-"));

        System.out.print("소요시간1 : " + (System.currentTimeMillis() - startTime));

        for (int i = 0; i < 300; i++)
            System.out.printf("%s", new String("|"));

        System.out.print("소요시간2 : " + (System.currentTimeMillis() - startTime));
    }
}