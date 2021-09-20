package ch9;

import java.util.Arrays;

/**
 * Date   : 2021. 09. 20
 * Source : RandomEx3.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class RandomEx3 {
    public static void main(String[] args) {
        for(int i=0; i<10; i++)
            System.out.print(getRand(5,10) + ",");
        System.out.println();

        int[] result = fillRand(new int[10], new int[]{2, 3, 7, 5});

        System.out.println(Arrays.toString(result));
    }

    public static int[] fillRand(int[] arr, int from, int to) {
        for(int i=0; i<arr.length; i++)
            arr[i] = getRand(from, to);
        return arr;
    }

    public static int[] fillRand(int[] arr, int[] data) {
        for(int i=0; i<arr.length; i++)
            arr[i] = data[getRand(0, data.length-1)];
        return arr;
    }

    public static int getRand(int from, int to) {
        return (int)(Math.random() * (Math.abs(to-from)+1)) + Math.min(from, to);
    }
}
