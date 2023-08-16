package org.example;

public class Test3 {
    final static String s =  "Hello";
    final  static    String s2 =  "Hello";
    public static void main(String[] args) {
//        String s = new String ("Hello").intern();
//        String s2 = new String ( "Hello").intern();
        if (s==s2){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
