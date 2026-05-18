package org.example.DSA.Array;

public class Sliding_window_technique {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println(slidingWindow(arr,arr.length,k));
    }

    private static int slidingWindow(int[] arr, int length, int k) {
        int res =0,max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            res+=arr[i];
        }
        for(int j=k;j<arr.length;j++){
            res+=arr[j]-arr[j-k];
            max=Math.max(max,res);
        }
        return res;
    }
}
