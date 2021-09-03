package ch4;

/**
 * Date   : 2021. 09. 03
 * Source : FlowEx30.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class FlowEx30 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

        while (true) {
            if (sum > 100)
                break;

            ++i;
            sum += i;
        } // end of while

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
