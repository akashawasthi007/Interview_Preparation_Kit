package org.example.DSA.Array;

// You are given a binary array nums and an integer k.
// A k-bit flip is choosing a subarray of length k from nums and simultaneously changing every 0 in the subarray to 1, and every 1 in the subarray to 0.
// Return the minimum number of k-bit flips required so that there is no 0 in the array. If it is not possible, return -1.
// A subarray is a contiguous part of an array.

public class Minimum_Consecutive_Flip {
    public static void main(String[] args) {
        //int[] a = {0,0,1,1,1,0,1,0,0,1,1,0};
        int[] a = {0,0,1,1,0,0,1,1,0};
        int n = a.length;
        System.out.println(minKBitFlips(a,n));
    }
    private static int minKBitFlips(int[] nums, int n) {
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1] && nums[i]!=nums[0])
                count++;
        }
        return count;
    }
}
