package ch04;

/**
 * Date   : 2021. 09. 03
 * Source : FlowEx31.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class FlowEx31 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0)
                continue;
            System.out.println(i);
        }
    }
}
