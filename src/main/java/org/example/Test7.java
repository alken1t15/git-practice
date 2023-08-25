package org.example;

import java.math.BigDecimal;
import java.util.Stack;

public  class Test7 {
    public static void main(String[] args) {
//        int[] arr = new int[]{4,100, 7, 2, 9, 5, 4, 33};
//        bubbleSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
     //   System.out.println(binarySearch(arr, 33));
        int[][] arr = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {2, 2, 3, 4, 5, 6, 7, 8, 9},
                {3, 3, 3, 4, 5, 6, 7, 8, 9},
                {4, 4, 4, 4, 5, 6, 7, 8, 9},
                {5, 5, 5, 5, 5, 6, 7, 8, 9},
                {6, 6, 6, 6, 6, 6, 7, 8, 9},
                {7, 7, 7, 7, 7, 7, 7, 8, 9},
                {8, 8, 8, 8, 8, 8, 8, 8, 9},
                {9, 9, 9, 9, 9, 9, 9, 9, 9}
        };

//        sort(arr);
        sort();
    }


    public static void bubbleSort(int[] arr){
      //  BigDecimal bigDecimal = new BigDecimal();
        int temp;
        boolean sort = false;
        while (!sort){
            sort=true;
            for (int i = 0;i<arr.length-1;i++){
                if (arr[i]>arr[i+1]){
                    temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                    sort=false;
                }
            }
        }

    }


    public static void sort(){
        for (int i = 9;i>=0;i--){
            for (int j= 9;j>=0;j--){
                System.out.print(i+ "" + j + " ");
            }
        }
        System.out.println();
    }


    public static void sort(int[][] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
