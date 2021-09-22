package ch11;

/**
 * Date   : 2021. 09. 22
 * Source : AsciiPrint.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
public class AsciiPrint {
    public static void main(String[] args) {
        char ch = ' ';
        // 공백(' ')이루의 문자들을 출력한다.
        for (int i = 0; i < 95; i++)
            System.out.print(ch++);
    }
}
