package org.example.Interface.Examp1;

public class CalculateTwoNumbersClass implements CalculateTwoNumbers {

    @Override
    public int getTwoNum(int num1, int num2) {
        return CalculateTwoNumbers.super.getTwoNum(num1, num2);
    }
}
