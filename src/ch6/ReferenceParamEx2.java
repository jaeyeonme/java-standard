package ch6;

/**
 * Date   : 2021. 09. 13
 * Source : ReferenceParamEx2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ReferenceParamEx2 {
    public static void main(String[] args) {

        int[] x = { 10 };
        System.out.println("main() : x = " + x[0]);

        change2(x);
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]);

    }

    static void change2(int[] x) {  // 참조형 매개변수
        x[0] = 1000;
        System.out.println("change() : x = " + x[0]);
    }
}
