package org.example.Classes.StaticNonStatic;


import static org.example.Classes.StaticNonStatic.StaticNonStatic.staticMethod;

public class StaticBuild {

        public static void main(String[] args) {

            StaticNonStatic nonStatic = new StaticNonStatic();

            nonStatic.nonStaticMethod();
            staticMethod();
        }
    }

