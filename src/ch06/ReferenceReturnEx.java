package ch06;

/**
 * Date   : 2021. 09. 13
 * Source : ReferenceReturnEx.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class Data3 {int x; }

class ReferenceReturnEx {
    public static void main(String[] args) {

        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data3 copy(Data3 d) {
        Data3 tmp3 = new Data3();
        tmp3.x = d.x;
        return tmp3;
    }
}
