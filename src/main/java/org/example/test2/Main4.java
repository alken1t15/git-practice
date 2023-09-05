package org.example.test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String[] arrNumber = second.split(" ");
        int n = Integer.parseInt(first.split(" ")[0]);
        int m = Integer.parseInt(first.split(" ")[1]);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : arrNumber) {
            numbers.add(Integer.parseInt(s));
            numbers.add(Integer.parseInt(s));
        }
        int temp = 0;
        while (true) {
            if (numbers.isEmpty()) {
                if (temp == n) {
                    System.out.println(arrayList.size());
                    for (int b : arrayList) {
                        System.out.print(b + " ");
                    }
                } else {
                    System.out.println(-1);
                }
                break;
            }
            int max = numbers.get(0);
            int indexMax = 0;

            for (int i = 1; i < numbers.size(); i++) {
                int current = numbers.get(i);

                if (current > max) {
                    max = current;
                    indexMax = i;
                }

            }

            if (temp + max > n) {
                if (numbers.size() == 1) {
                    numbers.clear();
                } else {
                    numbers.remove(indexMax);
                }
            } else {
                temp += max;
                arrayList.add(max);
                if (numbers.size() == 1) {
                    numbers.clear();
                } else {
                    numbers.remove(indexMax);
                }
            }
        }
    }
}