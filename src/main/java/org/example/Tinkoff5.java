package org.example;

import java.util.*;

public class Tinkoff5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        String[] input1Parts = input1.split(" ");
        int n = Integer.parseInt(input1Parts[0]);
        int c = Integer.parseInt(input1Parts[1]);
        int d = Integer.parseInt(input1Parts[2]);

        String[] input2Parts = input2.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input2Parts[i]);
        }

        int[] arrSort = new int[n];
        System.arraycopy(arr, 0, arrSort, 0, n);
        Arrays.sort(arrSort);

        int minMin = arrSort[0];
        int maxMin = arrSort[c - 1];

        int[] res = new int[n];

        if (minMin - d < 0) {
            int counter = 0;
            boolean negSet = false;
            for (int x : arr) {
                if (x < maxMin || (x == maxMin && counter < c)) {
                    if (x == minMin && !negSet) {
                        res[counter] = x - d;
                        negSet = !negSet;
                        counter++;
                    } else {
                        res[counter] = x + d;
                        counter++;
                    }
                } else {
                    res[counter] = x;
                }
                counter++;
            }
        } else if (minMin - d == 0) {
            boolean zeroSet = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] == minMin && !zeroSet) {
                    res[i] = minMin - d;
                    zeroSet = !zeroSet;
                } else {
                    res[i] = arr[i];
                }
            }
        } else {
            int counter = 0;
            for (int x : arr) {
                if (x < maxMin || (x == maxMin && counter < c)) {
                    res[counter] = x - d;
                    counter++;
                } else {
                    res[counter] = x;
                }
                counter++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
