package org.example;

import java.util.ArrayList;
import java.util.List;

public class LeetCode3 {
    public static void main(String[] args) {
        List<Integer> list = generate(0);
            for (int num : list) {
                System.out.print(num + " ");
            }
    }

    public static List<Integer> generate(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            // Каждый ряд начинается с 1
            row.add(1);

            // Рассчитываем значения для элементов в середине ряда, используя предыдущий ряд
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
}