package ch9;

/**
 * Date   : 2021. 09. 20
 * Source : ClassEx1.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
final class Card4 {
    String kind;
    int num;

    Card4() {
        this("SPACE", 1);
    }

    Card4(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return kind + ":" + num;
    }
}
class ClassEx1 {
    public static void main(String[] args) throws Exception {
        Card4 c = new Card4("HEART", 3);  // new연산자로 객체 생성
        Card4 c2 = Card4.class.newInstance();       // Class객체를 통해서 객체 생성

        Class cobj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cobj.getName());
        System.out.println(cobj.toGenericString());
        System.out.println(cobj.toString());
    }
}
