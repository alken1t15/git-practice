package org.example.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static int findSheriffWord(String s) {
        int countWord = 0;
        Map<Character, Integer> lettersCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            lettersCount.put(c, lettersCount.getOrDefault(c, 0) + 1);
        }

        int maxWords = Integer.MAX_VALUE;
        String word = "";
        while (maxWords > 0) {
            for (char c : "sheriff".toCharArray()) {
                int count = lettersCount.getOrDefault(c, 0);
                if (count == 0) {
                    return countWord;
                }
                word += c;
                lettersCount.put(c, count - 1);
                maxWords--;
                if (word.contains("sheriff")){
                    word = "";
                    countWord++;
                }
            }
        }

        if (isSheriffWord(lettersCount)) {
            return countWord;
        }

        return countWord;
    }

    public static boolean isSheriffWord(Map<Character, Integer> lettersCount) {
        for (int count : lettersCount.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int sheriffWord = findSheriffWord(s);
        System.out.println(sheriffWord);
    }
}
