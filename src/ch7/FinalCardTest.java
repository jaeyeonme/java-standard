package ch7;

/**
 * Date   : 2021. 09. 16
 * Source : FinalCardTest.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class Card2 {
    final int NUMBER;           // 상수지만 선언과 함께 초기화 하지 않고
    final String KIND;          // 생성자에서 단 한번만 초기화할 수 있다.
    static int width = 100;
    static int height = 250;

    Card2(String kind, int num) {
        KIND = kind;   // 매개변수로 넘겨받은 값으로 KIND와 NUMBER를 초기화 한다.
        NUMBER = num;  //
    }

    Card2() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}


class FinalCardTest {
    public static void main(String[] args) {
        Card2 c = new Card2("HEART", 10);
//      c.NUMBER = 5;  <- ERROR! cannot assign a value to final variable NUMBER
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);  // System.out.println(c.toString());
    }
}
