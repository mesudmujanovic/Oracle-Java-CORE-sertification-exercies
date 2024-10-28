package org.example.BuildingBlock;

public class Variables {

    public static void main(String[] args) {
        final int MAX_HEIGHT = 100;
        final int[] MY_NUMBERS = new int[5];
        MY_NUMBERS[0] = 1;
    }

    public static void doesNotCompile(boolean isOK) {
        int a;
        if (isOK) a = 1;
    }

    public void compiles(boolean isOK) {
        int a;
        if (isOK) {
            a = 1;
        } else {
            a = 4;
        }
    }


}
