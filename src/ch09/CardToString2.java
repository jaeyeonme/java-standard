package ch09;

/**
 * Date   : 2021. 09. 20
 * Source : CardToString2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class Card2 {
    String kind;
    int number;

    Card2() {
        this("SPACE", 1); // Card(String kind, int number)를 호출
    }

    Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "kind : " + kind + ", number : " + number; // Card인스턴스의 kind와 number를 문자열로 반환한다.
    }
}

class CardToString2 {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2("HEART", 10);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
