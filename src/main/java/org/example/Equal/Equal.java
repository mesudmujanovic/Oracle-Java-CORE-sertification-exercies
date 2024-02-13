package org.example.Equal;

public class Equal {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 1;
        String a = "A";
        String b = "A";
        String a1 = new String("Hello");
        String a2 = new String("Hello");

        if(num1 == num2){
            //return True
            System.out.println("True");
        } else{
            System.out.println("False");
        }

        if(a.equals(b)){
            System.out.println("True");
            //return True
        } else{
            System.out.println("False");
        }

        if(a == b){
            //return True
            System.out.println("True");
        } else{
            System.out.println("False");
        }

        if(a1 == a2){
            System.out.println("True");
        } else{
            //return False
            System.out.println("False");
        }
        if(a1.equals(a2)){
            System.out.println("True");
            //return True
        } else{
            System.out.println("False");
        }
    }
}
