package ch13;

/**
 * Date   : 2021. 09. 26
 * Source : ThreadEx16.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ThreadEx16 {
    public static void main(String[] args) {
        RunImplEx16 r1 = new RunImplEx16();
        RunImplEx16 r2 = new RunImplEx16();
        RunImplEx16 r3 = new RunImplEx16();
        Thread th1 = new Thread(r1, "*");
        Thread th2 = new Thread(r2, "**");
        Thread th3 = new Thread(r3, "***");
        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            r1.suspend();      // th1.suspend()이 아님에 주의
            Thread.sleep(2000);
            r2.suspend();
            Thread.sleep(3000);
            r1.resume();
            Thread.sleep(3000);
            r1.stop();
            r2.stop();
            Thread.sleep(2000);
            r3.stop();
        } catch (InterruptedException e) {}
    }
}

class RunImplEx16 implements Runnable {
    boolean suspend = false;
    boolean stopped = false;

    public void run() {
        while (!stopped) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }

        System.out.println(Thread.currentThread().getName() + " - stopped");
    }

    public void suspend() { suspend = true;  }
    public void resume()  { suspend = false; }
    public void stop()    { stopped = true;  }
}