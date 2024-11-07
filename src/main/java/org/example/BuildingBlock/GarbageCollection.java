package org.example.BuildingBlock;

public class GarbageCollection {

    public static void main(String[] args) {
        String a, b;
        a = new String("Emperor");
        b = new String("King");
        a = b;
        System.gc();
        String c = a;
        a = null;
    }
}
