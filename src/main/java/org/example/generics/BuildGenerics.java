package org.example.generics;

import java.util.Map;

public class BuildGenerics {

    public static void main(String[] args) {

    MyClass<Integer> obj = new MyClass<>(10);
    MyClass<String> obj2 = new MyClass<>("Mesud");

        obj.showType();
        obj2.showType();


    ///////////////////////////////////////////
    ///Generics two arguments

    MyClassTwoArgs<Integer, String> twoArgs = new MyClassTwoArgs<>(10, "mesud");

//        twoArgs.showTwoArgs();

//        twoArgs.addToArgsMap(20, "Mesud");

    Map<Integer, String> arsMap = twoArgs.getArgsMap();
//        System.out.println("Map: " + arsMap);

    ///////////////////////////////////////////
    ///extends Number

    NumericFns<Integer> fns = new NumericFns<>(10);
//        System.out.println(fns.square());
  }
}