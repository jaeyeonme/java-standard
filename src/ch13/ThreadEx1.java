package ch13;

/**
 * Date   : 2021. 09. 25
 * Source : ThreadEx1.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        ThreadEx1_2 r = new ThreadEx1_2();
        Thread t2 = new Thread(r);  // 생성자 Thead(Runnable taret)

        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());  // 조상인 Thread의 getname()을 호출
        }
    }
}

class ThreadEx1_2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Thread.currentThread() - 현재 실행중인 Thread를 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}