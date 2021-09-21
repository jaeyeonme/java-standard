package ch07;

/**
 * Date   : 2021. 09. 16
 * Source : CaptionTvTest.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class Tv {
    boolean power;     // 전원상태(on/off)
    int channel;       // 채널

    void power()       { power = !power; }
    void channelUp()   { ++channel; }
    void channelDown() { --channel; }
}

class CaptionTv extends Tv {
    boolean caption;                      // 캡션상태(on/off)
    void displayCaption(String text) {
        if (caption) {                    // 캡션 상태가 on(true)일 때만 text를 보여 준다.
            System.out.println(text);
        }
    }
}

class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;                 // 조상 클래스로부터 상속받은 멤버
        ctv.channelUp();                  // 조상 클래스로부터 상속받은 멤버
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello World");
        ctv.caption = true;               // 캡션(자막)기능을 켠다.
        ctv.displayCaption("Hello, World");

    }
}