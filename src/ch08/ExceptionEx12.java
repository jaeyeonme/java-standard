package ch08;

/**
 * Date   : 2021. 09. 19
 * Source : ExceptionEx12.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        method1(); // 같은 클래스내의 static 멤버이므로 객체생성없이 직접 호출가능.
        // end of main
    }

    static void method1() throws Exception {
        method2();
        // end of method1
    }

    static void method2() throws Exception {
        throw new Exception();
        // end of method2
    }
}
