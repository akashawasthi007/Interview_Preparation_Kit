package org.example.DSA.Array;

// Question -  Given an array of integers arr[], the task is to find the first equilibrium point in the array.
// The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists.

public class Equilibrium_Point {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,2,1};
        System.out.println(findEquilibrium(arr));
    }

//    compute prefix sum and suffix sum
//    use auxiliary space
    private static int findEquilibrium(int[] arr) {
        int rsum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            rsum += arr[i];
        }
        int lsum = 0;
        for (int i = 0; i < arr.length; i++) {
            rsum -= arr[i];
            if(lsum == rsum){
                return i;
            }
            lsum += arr[i];
        }
        return -1;
    }
}

// Naive solution is to run a loop and do sum of all elemnt on left side and right side separately.
// Time Complexity - O(n^2)