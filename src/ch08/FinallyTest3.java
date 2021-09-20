package ch08;

/**
 * Date   : 2021. 09. 19
 * Source : FinallyTest3.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class FinallyTest3 {
    public static void main(String[] args) {
        // method1()은 static메서드이므로 인스턴스 생성없이 직접 호출이 간으하다.
        FinallyTest3.method1();
        System.out.println("method1()의 수행을 마치고 main 메서드로 돌아왔습니다.");
    } // end of main

    static void method1() {
        try {
            System.out.println("method1()이 호출되었습니다.");
            return;  // 현재 실행중인 메서드를 종료한다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1()의 finally블럭이 실행되었습니다.");
        }
    } // end of method1
}
