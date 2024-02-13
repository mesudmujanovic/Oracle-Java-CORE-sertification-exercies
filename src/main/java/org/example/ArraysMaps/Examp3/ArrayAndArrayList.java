package org.example.ArraysMaps.Examp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayAndArrayList {
    public static void main(String[] args) {

        String[] friends = {"Skome","Erdal","Miki","Mesko"};

        List<String> arrayList = new ArrayList<>(
                Arrays.asList("Skome","Erdal","Miki","mesko"));

        System.out.println(friends[0]);
        System.out.println(arrayList.get(0));

        System.out.println(friends.length);
        System.out.println(arrayList.size());

        //We can't do this with friends
        arrayList.add("Adnan");
        arrayList.set(4, "Semir");
        System.out.println(arrayList);

        arrayList.remove("Semir");
        System.out.println(arrayList);

        String[] strings = Arrays.stream(friends)
                .filter(fr -> fr.startsWith("M"))
                        .toArray(frs -> new String[frs]);
        System.out.println(Arrays.toString(strings));


    }
}
