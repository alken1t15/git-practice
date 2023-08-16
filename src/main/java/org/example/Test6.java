package org.example;

public class Test6 {
    public static void m(A a){
        System.out.println("a");
    }
    public static void m(B b){
        System.out.println("b");
    }

    public static void main(String[] args) {
        m(new C());
    }
}
