package ch8;

/**
 * Date   : 2021. 09. 19
 * Source : FinallyTest.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class FinallyTest {
    public static void main(String[] args) {
        try {
            startInstall();         // 프로그램 설치에 필요한 준비를 한다.
            copyFile();             // 파일들을 복사한다.
            deleteTempFiles();      // 프로그램 설치에 사용된 임시파일들을 삭제한다.
        } catch (Exception e) {
            e.printStackTrace();
            deleteTempFiles();      // 프로그램 설치에 사용된 임시파일들을 삭제한다.
        } // end of try~catch
    } // end of main

    static void startInstall() {
        /* 프로그램 설치에 필요한 준비를 하는 코드를 적는다. */
    }

    static void copyFile() { /* 파일들을 복사하는 코드를 적는다 */ }
    static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다. */ }
}
