package ch05;

/**
 * Date   : 2021. 09. 10
 * Source : ArrayEx18.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ArrayEx18 {
    public static void main(String[] args) {

        int[][] score = {{100, 100, 100}, {20, 20, 20}, {40, 40, 40}};
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
            }
        }

        for (int[] tmp : score) {
            for (int i : tmp) {
                sum += i;
            }
        }

        System.out.println("sum = " + sum);
    }
}
