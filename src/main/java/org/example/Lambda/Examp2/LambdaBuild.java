package org.example.Lambda.Examp2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaBuild {
    public static void main(String[] args) {

     MatematickaOperacija matematickaOperacija = (a,b) -> a + b;
     int rezultat = matematickaOperacija.izvrsiSabiranje(5,3);
     System.out.println(rezultat);

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        int result = add.apply(2,2);
        System.out.println(result);

        BiConsumer<String, String> strings = (a, b) -> {
          System.out.println(a + b);
        };
        strings.accept("Mesud ", "Mujanovic");

        Function<Integer, Integer> ints = x -> {
            return x - x;
        };
        System.out.println(ints.apply(2));

        Map<String, Integer> ocene = new HashMap<>();
        ocene.put("Ana", 95);
        ocene.put("Marko", 80);
        ocene.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
