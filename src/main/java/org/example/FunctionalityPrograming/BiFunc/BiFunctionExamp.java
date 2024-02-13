package org.example.FunctionalityPrograming.BiFunc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class BiFunctionExamp {
    public static void main(String[] args) {
        //////////////
        BiFunction<Integer, Integer, Integer> calculate = (a,b) -> a + b;
        Integer getResult = calculate.apply(2,2);
        System.out.println(getResult);
        ///////////
        BiFunction<String, String, String> concatFunction = (s1, s2) -> s1 + s2;
        String result = concatFunction.apply("Mesud", "Mujanovic");
        //////////////
        List<Integer> numbers = List.of(1,2,3,4,5);
        BiFunction<Integer, Integer, Integer> multiplyFunction = (num1, num2) -> num1 * num2;
        List<Integer> transformedNumbers = numbers.stream()
                .map(nums -> multiplyFunction.apply(nums, 2))
                .collect(Collectors.toList());
        System.out.println(transformedNumbers);
        ///////////////
        BiFunction<String, String, String> fullNameFunction = (firstName, lastName) -> firstName + " " + lastName;
        Map<Integer, String>  idToFullNameMap = Map.of(
                1, fullNameFunction.apply("Mesud", "Mujanovic"),
                2, fullNameFunction.apply("Erdal", "Zoranic")
        );
        System.out.println(idToFullNameMap);
        ///////////////////
        HashMap<String, String> idToNameMap = new HashMap<>();
        idToNameMap.put("First",fullNameFunction.apply("Mesud","Mujanovic"));
        idToNameMap.put("Second",fullNameFunction.apply("Erdal","Zoranic"));
        System.out.println(idToNameMap);
    }
}
