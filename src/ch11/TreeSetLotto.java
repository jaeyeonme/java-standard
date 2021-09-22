package ch11;

import java.util.Set;
import java.util.TreeSet;

/**
 * Date   : 2021. 09. 22
 * Source : TreeSetLotto.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
public class TreeSetLotto {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random() * 45) + 1;
            set.add(num);  // set.add(new Integer(num));
        }

        System.out.println(set);
    }
}

