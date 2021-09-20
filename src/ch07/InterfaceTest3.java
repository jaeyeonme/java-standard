package ch07;

/**
 * Date   : 2021. 09. 18
 * Source : InterfaceTest3.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class InterfaceTest3 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.methodA();
    }
}

class A3 {
    void methodA() {
        I2 i = InstanceManager.getInstance();  // 제3의 클래스의 메서드를 통해서 인터페이스 i를 구현한 클래스의 인스턴스를 얻어온다.
        i.methodB();
        System.out.println(i.toString());      // i로 Object 클래스의 메서드 호출가능

    }
}

interface I2 {
    public abstract void methodB();
}

class B3 implements I2 {
    public void methodB() {
        System.out.println("methodB in B class");
    }

    public String toString() { return "class B"; }
}

class InstanceManager {
    public static I2 getInstance() {
        return new B3();
    }
}
