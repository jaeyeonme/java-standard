package ch9;

/**
 * Date   : 2021. 09. 20
 * Source : ShallowDeppCopy.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class Circle implements Cloneable {
    Point3 p;  // 원점
    double r; // 반지름

    Circle(Point3 p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle shallowCopy() {  // 얕은복사
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}

        return (Circle) obj;
    }

    public Circle deepCopy() {     // 깊은복사
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}

        Circle c= (Circle) obj;
        c.p = new Point3(this.p.x, this.p.y);

        return c;
    }

    public String toString() {
        return "[p = " + p + ", r = " + r + "]";
    }
}

class Point3 {
    int x, y;

    Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class ShallowDeppCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point3(1, 1), 2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        c1.p.x = 9;
        c1.p.y = 9;
        System.out.println("= c1의 변경 후 =");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
