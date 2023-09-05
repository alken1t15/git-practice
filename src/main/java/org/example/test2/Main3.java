package org.example.test2;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String length = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();


        String[] arr = second.split(" ");
        String[] arr2 = third.split(" ");
        ArrayList<Integer> arrNumber = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (i < 5) {
                arrNumber.add(Integer.parseInt(arr[i]));
                arr[i] = "";
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (String str : arr) {
            if (!str.isEmpty()) {
                res.add(Integer.parseInt(str));
            }
        }
        Collections.sort(arrNumber);

        if (arrNumber.size() < 1) {
            res.addAll(arrNumber);
        } else {
            res.addAll(1, arrNumber);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (Integer.parseInt(arr2[i]) != res.get(i)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}