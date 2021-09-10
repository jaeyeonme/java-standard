package ch5;

import java.util.Scanner;

/**
 * Date   : 2021. 09. 10
 * Source : MultiArrEx4.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class MultiArrEx4 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair",    "의자"},   // words[0][0], words[0][1]
                {"computer", "컴퓨터"},  // words[1][0], words[1][1]
                {"integer",  "정수"}    // words[2][0], words[2][1]
        };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? ", i + 1, words[i][0]);

            String tmp = scanner.nextLine();

            if (tmp.equals(words[i][1])) {
                System.out.printf("정답입니다. \n\n");
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다. \n\n", words[i][1]);
            }
        } // end of for
    } // end of main
}