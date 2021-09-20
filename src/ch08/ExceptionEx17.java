package ch08;

/**
 * Date   : 2021. 09. 19
 * Source : ExceptionEx17.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ExceptionEx17 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외가 처리되었습니다.");
        }
    } // end of main

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메서드에서 예외가 처리되었습니다.");
            throw e;  // 다시 예외를 발생시킨다.
        }
    } // end of method1
}
