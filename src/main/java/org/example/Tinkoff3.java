package org.example;

import java.util.Scanner;

public class Tinkoff3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        boolean temp = true;

        while (temp){
            for (int i = a;i>0;i--){
                if (i>b){
                    System.out.println(b);
                    temp = false;
                    break;
                }
                b = b - i;
            }
        }
    }
}
