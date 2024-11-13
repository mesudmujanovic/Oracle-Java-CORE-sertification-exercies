package org.example.String;

public class StringBuilderIsMutable {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("John");
        name.append("Wayne");
        System.out.println(name);
    }

}
