package ch04;

/**
 * Date   : 2021. 09. 03
 * Source : FlowEx22.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class FlowEx22 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            System.out.printf("%d ", arr[i]);
        System.out.println();

        for (int tmp : arr) {
            System.out.printf("%d ", tmp);
            sum += tmp;
        }

        System.out.println();
        System.out.println("sum = " + sum);
    }
}
