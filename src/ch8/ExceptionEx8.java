package ch8;

/**
 * Date   : 2021. 09. 19
 * Source : ExceptionEx8.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("예외 메시지 : " + ae.getMessage());
        } // end of try~catch
        System.out.println(6);
    } // end of main
}
