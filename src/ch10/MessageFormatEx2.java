package ch10;

import java.text.MessageFormat;

/**
 * Date   : 2021. 09. 20
 * Source : MessageFormatEx2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class MessageFormatEx2 {
    public static void main(String[] args) {
        String tableName = "CUST_INFO";
        String msg = "INSERT INTO " + tableName + " VALUES (''{0}'', ''{1}'', {2}, ''{3}'');";

        Object[][] arguments = {
                {"이자바", "02-123-1234", "27", "07-09"},
                {"김프로", "032-333-1234", "33", "10-07"}
        };

        for (int i=0; i<arguments.length; i++) {
            String result = MessageFormat.format(msg, arguments[i]);
            System.out.println(result);
        }
    }
}
