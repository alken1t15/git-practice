package org.example;

import java.util.ArrayList;
import java.util.List;

public class LeetCode2 {
    public static void main(String[] args) {
        List<List<Integer>> list = generate(4);
        for (List<Integer> innerList : list) {
            for (int num : innerList) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 1; i<numRows+1;++i){
            List<Integer> list = new ArrayList<>();
            for (int j = 0;j<i;j++){
                if (list.isEmpty()){
                    list.add(1);
                }
               else if (list.size()+1 == i){
                    list.add(1);
                    break;
                }
               else {
                    List<Integer> temp = lists.get(i-2);
                   for (int e = 0; e<temp.size()-1;e++){
                       int temp2 = temp.get(e)+temp.get(e+1);
                       list.add(temp2);
                   }
                }
            }
            lists.add(list);
        }

        return lists;
    }
}