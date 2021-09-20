package ch08;

import java.io.File;

/**
 * Date   : 2021. 09. 19
 * Source : ExceptionEx15.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ExceptionEx15 {
    public static void main(String[] args) {
        // command line에서 입력받은 값을 이름을 갖는 파일을 생성한다.
        File f = createFile(args[0]);
        System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
    } // end of main

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals(""))
                throw new Exception("파일이름이 유효하지 않습니다.");
        } catch (Exception e) {
            // fileName이 부적절한 경우, 파일 이름을 '제목없음.txt'로 한다.
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);    // File클래스의 객체를 만든다.
            createFile(f);                 // 생성된 객체를 이용해서 파일을 생성한다.
            return f;
        }
    } // end of createFile

    static void createFile(File f) {
        try {
            f.createNewFile();            // 파일을 생성한다.
        } catch (Exception e) { }
    } // end of createNewFile
}
