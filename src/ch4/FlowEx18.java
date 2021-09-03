package ch4;

/**
 * Date   : 2021. 09. 03
 * Source : FlowEx18.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class FlowEx18 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
        }
    }
}
