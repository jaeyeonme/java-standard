package ch09;

/**
 * Date   : 2021. 09. 20
 * Source : WrapperEx1.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = 100;
        Integer i2 = 100;

        System.out.println("i == i2 ? " + (i == i2));
        System.out.println("i.equals(i2) ? " + i.equals(i2));
        System.out.println("i.compareTo(i2) = " + i.compareTo(i2));
        System.out.println("i.toString() = " + i.toString(i2));

        System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("SIZE = " + Integer.SIZE + " bits");
        System.out.println("BYTES = " + Integer.BYTES + " bytes");
        System.out.println("TYPE = " + Integer.TYPE);
    }
}
