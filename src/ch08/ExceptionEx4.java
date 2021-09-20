package ch08;

/**
 * Date   : 2021. 09. 19
 * Source : ExceptionEx4.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ExceptionEx4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(4);
        } catch (Exception e) {
            System.out.println(5); // 실행되지 않는다.
        } // end of try~catch
        System.out.println(6);
    } // end of main
}
