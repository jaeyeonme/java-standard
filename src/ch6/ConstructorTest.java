package ch6;

/**
 * Date   : 2021. 09. 15
 * Source : ConstructorTest.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
//      Data2 d4 = new Data4();		// compile error 발생
    }
}

class Data2 {
    int value;
}

class Data4 {
    int value;

    Data4(int x) {	// 매개변수가 있는 생성자
        value = x;
    }
}