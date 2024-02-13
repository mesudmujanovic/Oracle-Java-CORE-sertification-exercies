package org.example.ArraysMaps.Example4Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExamp {
    public static void main(String[] args) {

        String[] strings = {"M","A","R","G"};
        String arrayAsString = Arrays.toString(strings);
        System.out.println(arrayAsString);
        System.out.println(strings);

        String[] colors = {"Red", "Green", "Blue"};
        List<String> colorList = new ArrayList<>(Arrays.asList(colors));
        colorList.add("Yellow");
        System.out.println(colorList);

        List<String> colorsListAs = Arrays.asList(colors);
        // Add in the colorsListAs is not possible
//        colorsListAs.add("Black");
        System.out.println(colorsListAs);
    }
}
