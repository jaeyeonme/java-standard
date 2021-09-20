package ch03;

/**
 * Date   : 2021. 08. 24
 * Source : OperatorEx27.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class OperatorEx27 {
    public static void main(String[] args) {

        boolean b = true;
        char ch = 'C';

        System.out.printf("b = %b\n", b);
        System.out.printf("!b = %b\n", !b);
        System.out.printf("!!b = %b\n", !!b);
        System.out.printf("!!!b = %b\n", !!!b);
        System.out.println();

        System.out.printf("ch = %c\n", ch);
        System.out.printf("ch < 'a' || ch > 'z' = %b\n", ch < 'a' || ch > 'z');
        System.out.printf("!('a' <= ch && ch <= 'z') = %b\n", !('a' <= ch && ch <= 'z'));
        System.out.printf("  'a' <= ch && ch <= 'z' = %b\n", 'a' <= ch && ch <= 'z');

    }
}
