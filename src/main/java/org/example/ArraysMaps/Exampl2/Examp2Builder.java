package org.example.ArraysMaps.Exampl2;

import java.util.ArrayList;
import java.util.List;

public class Examp2Builder {

    public static void main(String[] args) {
        List<FinderJobs> finderJobs = new ArrayList<>();
        finderJobs.add(new FinderJobs("Mesud", "Mujanovic")
                .setJob("Web", "IT"));

        finderJobs.add(new FinderJobs("Erdal", "Zoranic")
                .setJob("Mobile", "IT"));

        finderJobs.forEach(st -> System.out.println(st.getName() + " - " + st.searchJob("Web")));
    }

}
