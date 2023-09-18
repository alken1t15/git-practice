package org.example;

public class A {
    public static void main(String[] args) {
        Book book = new Book( "Core Java" , 324.25);
        String name = book.name();

        double price = book.price();
    }


    public record Book(String name, double price){

    }


    public record Person(String name, int age) {

        public Person {
            if (age < 18) {
                throw new IllegalArgumentException("You are not allowed to participate in general elections");
            }
        }

        public void sayHello() {
            System.out.println("Hello, my name is " + name);
        }
    }
}
