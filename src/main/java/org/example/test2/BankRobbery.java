package org.example.test2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankRobbery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Необходимая сумма
        int m = scanner.nextInt(); // Количество номиналов купюр

        int[] denominations = new int[m];
        for (int i = 0; i < m; i++) {
            denominations[i] = scanner.nextInt(); // Номиналы купюр
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int denomination : denominations) {
            countMap.put(denomination, countMap.getOrDefault(denomination, 0) + 1);
        }

        int[] result = findRobberyCombination(n, denominations, countMap);
        if (result == null) {
            System.out.println("-1");
        } else {
            System.out.println(result.length);
            for (int denom : result) {
                System.out.print(denom + " ");
            }
        }
    }

    private static int[] findRobberyCombination(int n, int[] denominations, Map<Integer, Integer> countMap) {
        Arrays.sort(denominations);
        for (int i = 0; i < denominations.length; i++) {
            int remaining = n - denominations[i];
            if (countMap.containsKey(remaining)) {
                int[] result = new int[2];
                result[0] = denominations[i];
                result[1] = remaining;
                return result;
            }
        }
        return null;
    }
}