package org.example.Records;

public class Main {
    public static void main(String[] args) {

        PersonRecords personRecords =
                new PersonRecords("Mesud", 29);
        System.out.println(personRecords);

        CarRecords carRecords = new CarRecords("BMW", 2015);
        //addNewName will not work///
        //records is immutable;
        carRecords.addNewName("BMW M");
        System.out.println(carRecords);

        ///We can change only this way;
        CarRecords updateNameCardRecors = carRecords.addNewName("BMW X");
        System.out.println(updateNameCardRecors);
    }
}
