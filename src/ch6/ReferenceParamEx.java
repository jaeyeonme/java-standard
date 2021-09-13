package ch6;

/**
 * Date   : 2021. 09. 13
 * Source : ReferenceParamEx.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class Data1 { int x; }

class ReferenceParamEx {
    public static void main(String[] args) {
        Data1 d = new Data1();
        d.x =  10;
        System.out.println("main() : x = " + d.x);

        change1(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);

    }

    static void change1(Data1 d) {  // 참조형 매개변수
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }


}
