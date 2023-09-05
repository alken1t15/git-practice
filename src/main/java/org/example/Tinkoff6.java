package org.example;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Tinkoff6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String pass = scanner.next();
        System.out.println(solution(pass, Integer.parseInt(first.split(" ")[1])));
    }

    public static int solution(String password, int cnt) {
        var map = new HashMap<Character, Integer>();
        for (char c : password.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }

        var values = map.values()
                .stream()
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());

        for (int i = 0; i < cnt && values.size() > 0; i++) {
            if (values.get(0) > 1) {
                values.set(0, values.get(0) - 1);
            } else {
                values.remove(0);
            }
        }

        return values.size();
    }
}

