package org.example;

import java.util.*;

public class Tinkoff2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String pass = scanner.next();
        String[] arr = numbers.split(" ");
        ArrayList<Character> arrayList = new ArrayList<>();
        ArrayList<Integer> countChar = new ArrayList<>();
        for (int i = 0; i<Integer.parseInt(arr[0]);i++){
            Character str = pass.charAt(i);
            if (!arrayList.contains(str)){
                arrayList.add(str);
                countChar.add(1);
            }
            else {
                int getIndex = arrayList.indexOf(str);
                int temp = countChar.get(getIndex);
                countChar.set(getIndex,temp+1);
            }
        }
        if (arrayList.size()< Integer.parseInt(arr[1])){
                    System.out.println(arrayList);
        System.out.println(countChar);
            System.out.println(0);
        }
        else {
           for (int i = 0;i<Integer.parseInt(numbers.split(" ")[1]);i++){
               int max = countChar.get(0);
               for (int j =1;j<countChar.size();j++){
                   if (countChar.get(j) > max) {
                     max = countChar.get(j);
                   }
               }
               int getIndex = countChar.indexOf(max);
               countChar.remove(getIndex);
               char temp = arrayList.get(getIndex);
               arrayList.remove(Character.valueOf(temp));
               pass = pass.replaceAll(String.valueOf(temp),"");
           }
            System.out.println(pass.length());
        }
//        System.out.println(arrayList);
//        System.out.println(countChar);
//        System.out.println(numbers);
      //  System.out.println(pass);
    }
}
