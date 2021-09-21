package ch11;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Date   : 2021. 09. 21
 * Source : ExpValidCheck.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
public class ExpValidCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : Java ExpValidCheck \"EXPRESSION\"");
            System.out.println("Example : Java ExpValidCheck \"(2+3) * 1) + 3\"");
            System.exit(0);
        }

        Stack st = new Stack();
        String expression = args[0];

        System.out.println("expression : " + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop();
                }
            }

            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        } // try
    }
}
