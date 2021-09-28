package ch13;

/**
 * Date   : 2021. 09. 28
 * Source : ThreadEx22.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ThreadEx22 {
    public static void main(String[] args) {
        RunnableEx22 r = new RunnableEx22();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account2 {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) {
        if (balance >= money) {
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            balance -= money;
        }
    } // withdraw
}

class RunnableEx22 implements Runnable {
    Account2 acc = new Account2();

    public void run() {
        while (acc.getBalance() > 0) {
            // 100, 200, 300중의 한 값을 임의로 선택해서 출금(withdraw)
            int money = (int)(Math.random() * 3 + 1)  * 100;
            acc.withdraw(money);
            System.out.println("balance : " + acc.getBalance());
        }
    } // run()
}

