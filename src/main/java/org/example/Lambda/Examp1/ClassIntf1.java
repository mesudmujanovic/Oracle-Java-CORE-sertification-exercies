package org.example.Lambda.Examp1;

public class ClassIntf1 {
    public static void main(String[] args) {

        LambdaInterface lambdaInterface = (input) -> System.out.println("Hello");
        lambdaInterface.myMethod("Helo");

        ///Without lambda
//        LambdaInterface lambdaInterface1 = new LambdaInterface() {
//            @Override
//            public void myMethod(String input) {
//                System.out.println("Hello + " + input);
//            }
//        };
//
//        lambdaInterface1.myMethod("Hello without Lambda");


    }
}