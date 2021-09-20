package ch9;

import java.util.Arrays;

/**
 * Date   : 2021. 09. 20
 * Source : CLoneEx2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class CLoneEx2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrClone = arr.clone();  // 배열 arr을 복제해서 같은 내용의 배열을 만든다.
        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}
