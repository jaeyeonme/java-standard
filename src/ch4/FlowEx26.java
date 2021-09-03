package ch4;

/**
 * Date   : 2021. 09. 03
 * Source : FlowEx26.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class FlowEx26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        // i를 1씩 증가시켜서 sum에 계속 더해나간다.
        while ((sum += ++i) <= 100) {
            System.out.printf("%d - %d\n", i, sum);
        }
    }
}
