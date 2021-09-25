package ch13;

/**
 * Date   : 2021. 09. 25
 * Source : ThreadEx10.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ThreadEx10 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx10());
        t.setDaemon(true);
        t.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println(i);

            if (i == 5)
                autoSave = true;
        }

        System.out.println("프로그램을 종료합니다.");
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000);  // 3초마다
            } catch (InterruptedException e) {}
            // autoSave의 값이 true이면 autoSave()를 호출
            if (autoSave) {
                autoSave();
            }
        }
    }

    public void autoSave() {
        System.out.println("작업파일이 저장되었습니다.");
    }
}
