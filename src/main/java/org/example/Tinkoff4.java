package org.example;

import java.util.Scanner;

public class Tinkoff4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("-> ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("m = ");
        int m = scanner.nextInt();

        int[][] begEndArr = new int[m][2];
        for (int i = 0; i < m; i++) {
            System.out.print("beg, end-> ");
            begEndArr[i][0] = scanner.nextInt();
            begEndArr[i][1] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int[] curArr = new int[begEndArr[i][1] - begEndArr[i][0] + 1];
            System.arraycopy(arr, begEndArr[i][0] - 1, curArr, 0, curArr.length);
            boolean second = false;
            for (int j = 0; j < curArr.length - 1; j++) {
                if (!second && curArr[j] > curArr[j + 1]) {
                    second = true;
                    continue;
                }
                if (second && curArr[j] < curArr[j + 1]) {
                    System.out.println("NO");
                    break;
                }
            }
            if (!second) {
                System.out.println("YES");
            }
        }
    }
}
