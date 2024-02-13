package org.example.Classes.INNERClass;


public class OutsiderClass {

    public void outsider(){
        System.out.println("Outsider method");
    }

    class InsiderClass {
        public void insider(){
            System.out.println("Insider class");
        }
    }

    public static void main(String[] args) {

        OutsiderClass outsiderClass = new OutsiderClass();
        outsiderClass.outsider();

        OutsiderClass.InsiderClass insiderClass = outsiderClass.new InsiderClass();
        insiderClass.insider();
    }
}
