package org.example.DSA.Array;

public class Subarray_sum_equals_K {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,7,8};
        int target = 7;
        System.out.println(subarraySumEqualsKUsingSlidingWindow(arr,arr.length,target));
    }

    private static int subarraySumEqualsKUsingSlidingWindow(int[] arr, int length, int target) {
        int sum = 0,count = 0,j=0;
        for(int i=0;i<length;i++){
            sum+=arr[i];
            while(j<i && sum>target){
                sum-=arr[j];
                j++;
            }
            if(sum==target){
                count++;
            }
        }
        return count;
    }
}

// Note : only applicable for positive numbers