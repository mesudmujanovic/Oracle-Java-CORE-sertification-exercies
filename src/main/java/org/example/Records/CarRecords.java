package org.example.Records;

public record CarRecords (String name, int year) {

    public CarRecords addNewName(String newName){
          return new CarRecords(newName, this.year);
    };

    public CarRecords addNewYear(int newYear){
        return new CarRecords(this.name, newYear);
    }
}
