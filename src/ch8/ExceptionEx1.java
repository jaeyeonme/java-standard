package ch8;

/**
 * Date   : 2021. 09. 19
 * Source : ExceptionEx1.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try { } catch (Exception e) { }
        } catch (Exception e) {
//          try { } catch (Exception e) { } // ERROR! 변수 e가 중복 선언
        } // end of try~catch

        try {

        } catch (Exception e) {

        } // end of try~catch
    } // end of main
}
