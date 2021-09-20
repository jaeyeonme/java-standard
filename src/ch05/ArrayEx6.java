package ch05;

/**
 * Date   : 2021. 09. 07
 * Source : ArrayEx6.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ArrayEx6 {
    public static void main(String[] args) {

        int[] score = { 79, 88, 91, 33, 100, 55, 95 };

        int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다.
        int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다.

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        } // end of for

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
