package ch3;

/**
 * Date   : 2021. 08. 22
 * Source : OperatorEx13.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class OperatorEx13 {
    public static void main(String[] args) {

        char c1 = 'a';

//        char c2 = c1 + 1;    // 컴파일 에러발생!
        char c2 = 'a' + 1;     // 컴파일 에러 없음

        System.out.println(c2);
    }
}