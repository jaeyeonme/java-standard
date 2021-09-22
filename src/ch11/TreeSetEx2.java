package ch11;

import java.util.TreeSet;

/**
 * Date   : 2021. 09. 22
 * Source : TreeSetEx2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int i = 0; i < score.length; i++)
            set.add(score[i]);

        System.out.println("50보다 작은 값 : " + set.headSet(50));
        System.out.println("50보다 큰 값 : " + set.tailSet(50));;
    }
}
