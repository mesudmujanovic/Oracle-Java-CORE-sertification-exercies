package org.example.Lambda.Examp1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2 , 8, 1, 6);
        numbers.sort((a, b) -> a.compareTo(b));
        System.out.println(numbers);

        ///Without lambda
        for(Integer number : numbers) {
            if(number > 4) {
                System.out.println(number);
            }
        }

        List<Integer> bigNumbs = Arrays.asList(5, 2 , 8, 1, 6);
        for (Integer numbres : bigNumbs){
            if(numbres > 4) {
                System.out.println("bigger then 4 " + numbres);
            }
        };

        numbers.forEach(nums -> {
            if(nums > 4) {
                System.out.println("foreach" + nums);
            }
        });

        List<Integer> lambdaNums = bigNumbs.stream()
                .filter(n -> n > 4)
                .collect(Collectors.toList());
        System.out.println("lambdaNums " + lambdaNums);

        List<String> lists = Arrays.asList("skome","mesko","mesud");
        List<String> newLists = lists.stream()
                .filter(l -> l.startsWith("me"))
                .collect(Collectors.toList());
        System.out.println(newLists);

    }
}
