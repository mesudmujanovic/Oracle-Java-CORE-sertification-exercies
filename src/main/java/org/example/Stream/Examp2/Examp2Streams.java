package org.example.Stream.Examp2;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Examp2Streams {
    public static void main(String[] args) {

       //////// toSet
        Stream<String> stream = Stream.of
                ("apple", "banana", "orange", "banana");

        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set);

        ////// toMap
        Stream<String> streamFruits = Stream.of("apple", "banana", "orange");
        Map<String, Integer> maps = streamFruits
                .collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println(maps);
    }
}
