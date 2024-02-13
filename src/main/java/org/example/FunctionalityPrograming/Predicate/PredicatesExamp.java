package org.example.FunctionalityPrograming.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatesExamp {
    public static void main(String[] args) {
        ////////////
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));

        //////////
        List<String> names = new ArrayList<>();
        names.add("Mesud");
        names.add("Erdal");
        names.add("Mirzet");
        names.add("Omer");
        Predicate<String> isLongName = name -> name.length() > 4;
        List<String> longNames = new ArrayList<>();
        for (String name : names){
            if(isLongName.test(name)){
                longNames.add(name);
            }
        }
        System.out.println(longNames);

        ////Streams
        List<String> streamName = names.stream()
                .filter(nam -> isLongName.test(nam))
                .collect(Collectors.toList());
        System.out.println(streamName);
    }
}
