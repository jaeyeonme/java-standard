package ch12;

/**
 * Date   : 2021. 09. 25
 * Source : AnnotationEx2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class NewClass {
    int newField;

    int getNewField() { return newField; }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() { return oldField; }
}

class AnnotationEx2 {
    public static void main(String args[]) {
        NewClass nc = new NewClass();

        nc.oldField = 10;						// @Deprecated가 붙은 대상을 사용
        System.out.println(nc.getOldField());	// @Deprecated가 붙은 대상을 사용
    }
}
