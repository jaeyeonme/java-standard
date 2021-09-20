package ch05;

/**
 * Date   : 2021. 09. 10
 * Source : ArrayEx15.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ArrayEx15 {
    public static void main(String[] args) {

        String source = "SOSHELP";
        String[] morse = {".-", "-...", "-.-", "-..", "."
                      , "..-.",  "--.", "....", "..", ".---"
                      ,  "-.-",  ".-..", "--", "-.", "---"
                      , ".--.",  "--.-", ".-.", "...", "-"
                      ,  "..-",  "...-", ".--", "-..-", "-.--"
                      , "--.." };

        String result = "";

        for (int i = 0; i < source.length(); i++) {
            result += morse[source.charAt(i) - 'A'];
        }

        System.out.println("source: " + source);
        System.out.println("morse: " + result);
    }
}
