package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.print(helloWorld());
    }

    public static String helloWorld() {
        return "Hello World";
    }

    public static String answers(int select) {
        if(select == 1) {
            return "One";
        }
        else if(select == 2) {
            return "Two";
        }
        return null;
    }
}
