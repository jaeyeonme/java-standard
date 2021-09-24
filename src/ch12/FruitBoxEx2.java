package ch12;

import java.util.ArrayList;

/**
 * Date   : 2021. 09. 24
 * Source : FruitBoxEx2.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
class Fruit2 implements Eatable {
    public String toString() { return "Fruit"; }
}
class Apple2 extends Fruit2  { public String toString() { return "Apple"; 	} }
class Grape2 extends Fruit2	 { public String toString() { return "Grape"; 	} }
class Toy2					 { public String toString() { return "Toy";		} }

interface Eatable {}

class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit2> fruitBox 	= new FruitBox<Fruit2>();
        FruitBox<Apple2> appleBox 	= new FruitBox<Apple2>();
        FruitBox<Grape2> grapeBox 	= new FruitBox<Grape2>();
//		FruitBox<Grape> grapeBox 	= new FruitBox<Apple>();	// 에러. 타입 불일치
//		FruitBox<Toy>	toyBox		= new FruitBox<Toy>();		// 에러.

        fruitBox.add(new Fruit2());
        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
//		appleBox.add(new Grape());								// 에러. Grape는 Apple의 자손이 아님
        grapeBox.add(new Grape2());

        System.out.println("fruitBox - " + fruitBox);
        System.out.println("appleBox - " + appleBox);
        System.out.println("grapeBox - " + grapeBox);
    }	// main
}

class FruitBox<T extends Fruit2 & Eatable> extends Box<T> {}

class Box2<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item)			{ list.add(item);		}
    T get(int i)				{ return list.get(i);	}
    int size()					{ return list.size();	}
    public String toString()	{ return list.toString(); }
}