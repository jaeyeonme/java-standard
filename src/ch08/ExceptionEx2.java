package ch08;

/**
 * Date   : 2021. 09. 19
 * Source : ExceptionEx2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ExceptionEx2 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = number / (int)(Math.random() * 10); // 7번째 라인
            System.out.println(result);
        }
    } // end of main
}
