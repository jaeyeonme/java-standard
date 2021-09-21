package ch11;

import java.util.Iterator;

/**
 * Date   : 2021. 09. 21
 * Source : MyVector2Test.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
public class MyVector2Test {
    public static void main(String[] args) {
        MyVector2 v = new MyVector2();
        v.add("0");
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");

        System.out.println("삭제 전 : " + v);
        Iterator it = v.iterator();
        it.next();
        it.remove();
        it.next();
        it.remove();

        System.out.println("삭제 후 : " + v);
    }
}
