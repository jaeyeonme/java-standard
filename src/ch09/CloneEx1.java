package ch09;

/**
 * Date   : 2021. 09. 20
 * Source : CloneEx1.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class Point implements Cloneable {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x = " + x + ", y = " + y;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();  // clone은 반드시 예외처리를 해줘어야 한다.
        } catch (CloneNotSupportedException e) {}
            return obj;
    }
}

class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point) original.clone(); // 복제(clone)해서 새로운 객체를 생성
        System.out.println(original);
        System.out.println(copy);
    }
}
