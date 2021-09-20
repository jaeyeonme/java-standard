package ch05;

/**
 * Date   : 2021. 09. 10
 * Source : ArrayEx16.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ArrayEx16 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}
