package ch9;

import java.io.File;
import java.util.Scanner;

/**
 * Date   : 2021. 09. 20
 * Source : ScannerEx3.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ScannerEx3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("data3.txt"));
        int cnt = 0;
        int totalSum = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Scanner sc2 = new Scanner(line).useDelimiter(",");
            int sum = 0;

            while (sc2.hasNextInt()) {
                sum += sc2.nextInt();
            }

            System.out.println(line + ", sum = " + sum);
            totalSum += sum;
            cnt++;
        }

        System.out.println("Line : " + cnt + ", Total: " + totalSum);
    }
}
