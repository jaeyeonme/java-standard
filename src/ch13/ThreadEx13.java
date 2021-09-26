package ch13;

import javax.swing.*;

/**
 * Date   : 2021. 09. 26
 * Source : ThreadEx13.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ThreadEx13 {
    public static void main(String[] args) throws Exception {
        ThreadEx13_1 th1 = new ThreadEx13_1();
        th1.start();
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        th1.interrupt();  // interrupt()를 호출하면, interrupted상태가 true가 된다.
        System.out.println("isInterrupted() : " + th1.isInterrupted());
    }
}

class ThreadEx13_1 extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            for (long x = 0; x < 250000000L; x++);  // 시간 지연
        }
        System.out.println("카운트가 종료되었습니다.");
    }
}
