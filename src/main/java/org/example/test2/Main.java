package org.example.test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String array = scanner.nextLine();
        String[] arrayPistol = array.split(" ");
        int pistol = 0;
        for (String s : arrayPistol) {
            if (Integer.parseInt(first.split(" ")[1]) > Integer.parseInt(s)) {
                if (pistol < Integer.parseInt(s)) {
                    pistol = Integer.parseInt(s);
                }
            }
        }
        System.out.println(pistol);
    }
}
