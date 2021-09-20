package ch9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Date   : 2021. 09. 20
 * Source : RegularEx2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class RegularEx2 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "c", "cA", "ca", "co", "c.", "cO", "c#", "car", "combat", "count", "date", "disc"};

        String[] pattern = {".*", "c[a-z]*", "c[a-z]", "c[a-zA-z]",
                        "c[a-zA-z0-9]", "c.", "c.*", "c\\.", "c\\w", "c\\d",
                        "c.*t", "[b|c].*", ".*a.*", ".*a.+", "[b|c].{2}" };

        for(int x = 0; x < pattern.length; x++) {
            Pattern p = Pattern.compile(pattern[x]);
            System.out.print("Pattern : " + pattern[x] + " 결과 : ");
            for(int i = 0; i < data.length; i++) {
                Matcher m = p.matcher(data[i]);
                if (m.matches())
                    System.out.print(data[i] + ",");
            }
            System.out.println();
        }
    } // public static void main(String[] args)
}
