package ch9;

/**
 * Date   : 2021. 09. 20
 * Source : StringEx6.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class StringEx6 {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal);  // int를 String으로 변환

        double dVal = 200.0;
        String strVal2 = dVal + "";            // String으로 변환하는 또 다른 방법

        double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        System.out.println(String.join("", strVal, "+", strVal2 + "=") + sum);
        System.out.println(strVal + "+" + strVal2 + "=" + sum2);
    }
}
