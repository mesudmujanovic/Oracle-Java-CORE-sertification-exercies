package org.example.generics;

public class MyClass<T> {
    T ob;

    public MyClass(T ob) {
        this.ob = ob;
    }

    public void showType() {
        System.out.println(ob);
    }
}
