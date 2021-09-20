package ch9;

import java.io.File;
import java.util.Scanner;

/**
 * Date   : 2021. 09. 20
 * Source : ScannerEx2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ScannerEx2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("data2.txt"));
        int sum = 0;
        int cnt = 0;

        while (sc.hasNextInt()) {
            sum += sc.nextInt();
            cnt++;
        }

        System.out.println("sum = " + sum);
        System.out.println("average = " + (double) sum / cnt);
    }
}
