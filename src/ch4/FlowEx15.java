package ch4;

/**
 * Date   : 2021. 09. 03
 * Source : FlowEx15.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class FlowEx15 {
    public static void main(String[] args) {
        System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
        System.out.println("----------------------------------------------------");

        for (int i=1; i<=10; i++)
            System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n",
                    i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
    }
}
