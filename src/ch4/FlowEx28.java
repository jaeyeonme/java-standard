package ch4;

import java.util.Scanner;

/**
 * Date   : 2021. 09. 03
 * Source : FlowEx28.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class FlowEx28 {
    public static void main(String[] args) {

        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 숫자를 입력하세요.> ");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");;
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        } while (input != answer);

        System.out.println("정답입니다.");
    }
}
