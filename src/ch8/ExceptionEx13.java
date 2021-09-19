package ch8;

/**
 * Date   : 2021. 09. 19
 * Source : ExceptionEx13.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ExceptionEx13 {
    public static void main(String[] args) {
        method1(); // 같은 클래스내의 static멤버이므로 객체생성없이 직접 호출가능.
        // end of main
    }

    static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    } // end of main
}
