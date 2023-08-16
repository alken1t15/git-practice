package org.example;

public class LeetCode {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2};
            for (int i: searchRange(arr, 2)){
                System.out.println(i );
            }
    }

    public static int[] searchRange(int[] nums, int target) {
        int id= binarySearch(nums,target);
        int left=0;
        int right=0;
        for (int i = id;i>=0;i--){
            if (target==nums[i]){
                left=i;
            }
            else {
                break;
            }
        }
        for (int i =left;i<nums.length;i++){
            if (nums[i]==target){
                right=i;
            }
            else {
                break;
            }
        }
        if(id == -1){
            return new int[]{-1,-1};
        }
        else {
         return  new int[]{left,right};
        }
    }


    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;

    }
}
