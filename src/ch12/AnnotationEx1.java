package ch12;

/**
 * Date   : 2021. 09. 25
 * Source : AnnotationEx1.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class Parent {
    void parentMethod() {}
}

class Child extends Parent {

    @Override
    void parentMethod() {}  // 조상 메서드의 이름을 잘못 적음
}