package ch09;

/**
 * Date   : 2021. 09. 20
 * Source : CardToString.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class Card {
    String kind;
    int number;

    Card() {
        this("SPACE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}

class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
