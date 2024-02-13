package org.example.Optional;


import java.util.Optional;

public class OptionalExa {
    public static void main(String[] args) {

        Optional<Cat> cats = findByName("Mesud");
        if(cats.isPresent()){
            System.out.println(cats.get().getAge());
        } else{
            System.out.println(0);

        }

    }

    private static Optional<Cat> findByName(String name){
        Cat cat = new Cat(name, 3);
        return  Optional.ofNullable(null);
    }
}
