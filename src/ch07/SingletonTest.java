package ch07;

/**
 * Date   : 2021. 09. 16
 * Source : SingletonTest.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
final class Singleton {
    private static Singleton s = new Singleton();
    private Singleton() {
        // ...
    }

    public static Singleton getInstance() {
        if (s == null)
            s = new Singleton();
        return s;
    }
}

class SingletonTest {
    public static void main(String[] args) {
//      Singleton s = new Singleton();  <- Error. Singleton() has private access in Singleton
        Singleton s = Singleton.getInstance();
    }
}
