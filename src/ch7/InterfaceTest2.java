package ch7;

/**
 * Date   : 2021. 09. 18
 * Source : InterfaceTest2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class A2 {
    void autoPlay(I i) {
        i.play();
    }
}

interface I {
    public abstract void play();
}

class B2 implements I {
    public void play() {
        System.out.println("play in B class");
    }
}

class C implements I {
    public void play() {
        System.out.println("ply in C class");
    }
}

class InterfaceTest2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.autoPlay(new B2());  // void autoPlay(I i) 호출
        a.autoPlay(new C());   // void autoPlay(I i) 호출

    }
}
