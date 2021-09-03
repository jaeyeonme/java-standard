package ch4;

/**
 * Date   : 2021. 09. 03
 * Source : FlowEx24.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;

        System.out.println("카운트 다운을 시작합니다.");

        while (i-- != 0) {
            System.out.println(i);
            for (int j = 0; j < 2_000_000_000; j++) {
                ;
            }
        }

        System.out.println("GAME OUT");
    }
}
