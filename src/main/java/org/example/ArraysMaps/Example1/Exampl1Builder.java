package org.example.ArraysMaps.Example1;

import java.util.ArrayList;
import java.util.List;

public class Exampl1Builder {
    public static void main(String[] args) {
        List<Kandidate> kandidates = new ArrayList<>();
                 kandidates.add(new Kandidate("skome", "222", "dds")
                .addKnowledge("java", 12));

                 kandidates.add(new Kandidate("eki", "222", "dds")
                .addKnowledge("java", 22));

                 kandidates.add(new Kandidate("miki", "222", "dds")
                .addKnowledge("java", 33));

        ///With Lambda
        kandidates.forEach(kand -> System.out.println(kand.getName()
                + kand.getNumberOfMonthWorkExperienceForKnowledge("java")));

//        for (Kandidate kandidate : kandidates) {
//            System.out.println(kandidate.getName() +  kandidate.getNumberOfMonthWorkExperienceForKnowledge("java"));
//        }
    }
}
