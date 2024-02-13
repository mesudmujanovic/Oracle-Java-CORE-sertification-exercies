package org.example.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEXA1 {
    public static void main(String[] args) {
        stream();
        improveStream();
    }

    public static void stream() {
        ///Error/// question for Oracle Java test
        Stream<Integer> numStream = java.util.stream.Stream.of(10, 20, 30);
        numStream.map(n -> n + 10)
                .peek(s -> System.out.print(s))
                .collect(Collectors.toList());
        numStream.forEach(s -> System.out.println(s));
    }

    public static void improveStream() {
        ///Improve error
        List<Integer> improveStream = List.of(10, 20, 30);
        improveStream.stream()
                .map(n -> n + 10)
                .peek(s -> System.out.print(s))
                .collect(Collectors.toList());

        improveStream.forEach(s -> System.out.println(s));
    }
}
