package org.example;

public class LeetCode4 {
    public static void main(String[] args) {
        int[] arr = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }

//    public static int maxProfit(int[] prices) {
//        int minPrice = prices[0];
//        int minId = 0;
//        int maxPrice = 0;
//        int profit;
//        for (int i = 1;i<prices.length-1;i++){
//            if (minPrice>prices[i]){
//                if (i+2!=prices.length) {
//                    minPrice = prices[i];
//                    minId = i;
//                }
//            }
//        }
//
//        for (int i = minId; i<prices.length;i++){
//            if (i==minId){
//               maxPrice = prices[i];
//            }
//           else if (maxPrice<prices[i]){
//                maxPrice=prices[i];
//            }
//        }
//        profit = maxPrice-minPrice;
//        if (profit>=minPrice){
//            return profit;
//        }
//        else {
//            return 0;
//        }
//    }
//}


//        int maxPrice = prices[minId+1];
//        for (int i = minId+2; i<prices.length;i++){
//            if (maxPrice<prices[i]){
//                maxPrice=prices[i];
//            }
//        }


    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int sell = prices[i];
            if (sell > buy) {
                profit = Math.max(profit, sell - buy);
            } else {
                buy = sell;
            }
        }
        return profit;
    }
}