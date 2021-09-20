package ch9;

import java.util.Random;

/**
 * Date   : 2021. 09. 20
 * Source : RandomEx1.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class RandomEx1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Random rand2 = new Random();

        System.out.println(" = rand = ");
        for(int i = 0; i < 5; i++)
            System.out.println(i + " : " + rand.nextInt());

        System.out.println();
        System.out.println(" = rand = ");
        for(int i = 0; i < 5; i++)
            System.out.println(i + " : " + rand2.nextInt());
    }
}
