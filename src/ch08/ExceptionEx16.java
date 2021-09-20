package ch08;

import java.io.File;

/**
 * Date   : 2021. 09. 19
 * Source : ExceptionEx16.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ExceptionEx16 {
    public static void main(String[] args) {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "다시 입력해 주시기 바랍니다.");
        }
    } // end of main

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals(""))
            throw new Exception("파일이름이 유효하지 않습니다.");

        File f = new File(fileName);    // File 클래스의 객체를 만든다.
        // File 객체의 createNewFIle 메서드를 이용해서 실제 파일을 생성한다.
        f.createNewFile();
        return f;                      // 생성된 객체의 참조를 반환한다.
    } // end of createFile
} // end of class
