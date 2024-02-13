package org.example.generics;

public class NumericFns<T extends Number> {
    T ob;

   public NumericFns(T ob) {
        this.ob = ob;
    }

   public double square() {
        return ob.intValue() * ob.doubleValue();
    }
}
