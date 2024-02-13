package org.example.FunctionalityPrograming.Supplier;

import java.util.function.Supplier;

public class SupplierFunc {
    public static void main(String[] args) {
        time();
        String welcomeMessage = string();
    }

    public static void time() {
        Supplier<String> currentDateTimeSupplier = () -> java.time.LocalDateTime.now().toString();
        String currentDateTime = currentDateTimeSupplier.get();
        System.out.println("Trenutni datum i vrijeme: " + currentDateTime);
    }

    public static String string() {
        Supplier<String> welcomeMessageSupplier = () -> "Dobro dosli";
        String welcomeMessage = welcomeMessageSupplier.get();
        System.out.println(welcomeMessage);
        return welcomeMessage;
    }
}
