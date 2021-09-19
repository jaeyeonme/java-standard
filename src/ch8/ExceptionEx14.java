package ch8;

/**
 * Date   : 2021. 09. 19
 * Source : ExceptionEx14.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    } // end of main

    static void method1() throws Exception {
        throw new Exception();
        // end of method1()
    } // end of class
}
