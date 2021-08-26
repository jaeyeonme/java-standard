package ch4;

/**
 * Date   : 2021. 08. 26
 * Source : FlowEx1.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class FlowEx1 {
    public static void main(String[] args) {

        int x = 0;
        System.out.printf("x = %d일때, 참인 것은\n", x);

        if (x == 0) System.out.println("x == 0");
        if (x != 0) System.out.println("x != 0");
        if (!(x == 0)) System.out.println("!(x == 0)");
        if (!(x != 0)) System.out.println("!(x != 0)");

        x = 1;
        System.out.printf("x = %d일떄, 참인 것은\n", x);

        if (x == 0) System.out.println("x == 0");
        if (x != 0) System.out.println("x != 0");
        if (!(x == 0)) System.out.println("!(x == 0)");
        if (!(x != 0)) System.out.println("!(x != 0)");
    }
}
