package ch04;

/**
 * Date   : 2021. 09. 03
 * Source : FlowEx29.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class FlowEx29 {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            System.out.printf("i=%d ", i);

            int tmp = i;

            do {
                // tmp%10이 3의 배수인지 확인 (0 제외)
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0)
                    System.out.print("짝");
                // tmp/=10은 tmp = tmp/10 과 동일
            } while((tmp /= 10) != 0);

            System.out.println();
        }
    }	// main
}
