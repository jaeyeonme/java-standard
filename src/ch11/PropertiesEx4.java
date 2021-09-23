package ch11;

import java.util.Properties;

/**
 * Date   : 2021. 09. 23
 * Source : PropertiesEx4.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class PropertiesEx4 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();
        System.out.println("java.version : " + sysProp.getProperty("java.version"));

        System.out.println("user.language : " + sysProp.getProperty("user.language"));
        sysProp.list(System.out);
    }
}
