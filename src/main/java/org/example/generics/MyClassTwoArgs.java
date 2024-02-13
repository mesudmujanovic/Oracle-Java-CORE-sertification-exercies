package org.example.generics;

import java.util.HashMap;
import java.util.Map;

public class MyClassTwoArgs <T, V> {

    T firstArg;
    V secondArg;

    Map<T, V> argsMap;

    public MyClassTwoArgs(T firstArg, V secondArg){
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public Map<T,V> getArgsMap(){
        return argsMap;
    }

    public void showTwoArgs(){
         System.out.println(firstArg + " " + secondArg);
    }

    public void showArgsMap(){
        System.out.println("Arguments Map: " + argsMap);
    }
}
