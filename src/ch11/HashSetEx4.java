package ch11;

import java.util.HashSet;

/**
 * Date   : 2021. 09. 22
 * Source : HashSetEx4.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
public class HashSetEx4 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new Person2("David", 10));
        set.add(new Person2("David", 10));

        System.out.println(set);
    }
}

class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Person2) {
            Person2 tmp = (Person2) obj;
            return name.equals(this.name) && age == tmp.age;
        }

        return false;
    }

    public int hashCode() {
        return (name + age).hashCode();
    }

    public String toString() {
        return name + ":" + age;
    }
}
