package ch3;

/**
 * Date   : 2021. 08. 22
 * Source : OperatorEx12.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class OperatorEx12 {
    public static void main(String[] args) {

        char c1 = 'a';      // c1에는 문자 'a'의 코드값인 97이 저장된다.
        char c2 = c1;       // c1에는 저장되어 있는 값이 c2에 저장된다.
        char c3 = ' ';      // c3를 공백으로 초기화 한다.

        int i = c1 + 1;

        c3 = (char)(c1 + 1);
        c2++;
        c2++;

        System.out.println("i = " + i);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
