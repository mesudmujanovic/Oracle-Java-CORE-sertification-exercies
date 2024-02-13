package org.example.Interface.Examp1;

public interface CalculateTwoNumbers {

    private int speakWithArguments(int num1, int num2) {
        return  num1 + num2;
    }

    default int getTwoNum(int num1, int num2){
        return speakWithArguments(num1, num2);
    }

}
