package org.example.test1;

public class Parent {

    public static   int BASE = 7;

   public static final Parent parent = new Parent();
   private static final int DELTA =5;



   private int x;
    public Parent(){
        x = BASE + DELTA;
    }


    public static void main(String[] args) {
        System.out.println(Parent.parent.x);
    }
}
