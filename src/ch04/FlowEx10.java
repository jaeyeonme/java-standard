package ch04;

import java.util.Scanner;

/**
 * Date   : 2021. 08. 27
 * Source : FlowEx10.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class FlowEx10 {
    public static void main(String[] args) {

        int score = 0;
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요. (1~100) > ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        score = Integer.parseInt(tmp);

        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;

            case 8:
                grade = 'B';
                break;

            case 7:
                grade = 'C';
                break;

            default:
                grade= 'F';
        }

        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}
