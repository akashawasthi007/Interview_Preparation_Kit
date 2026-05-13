package org.example.DSA.Array;

public class Maximum_Circular_Sum_Subarray {
// A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].
    static int maxSubarraySumCircular1(int[] nums,int n) {

        int res = nums[0];
        for(int i=0;i<n;i++){
            int curr_sum = nums[i];
            int curr_max = nums[i];
            for(int j=1;j<n;j++){
                int index = (i+j)%n;
                curr_sum+=nums[index];
                curr_max = Math.max(curr_max,curr_sum);
            }
            System.out.println(curr_max);
            res = Math.max(res,curr_max);
        }
        return res;
    } // O(n^2)

    public static void main(String[] args) {
        int[] a = {5,-2,3,4};
        int n = a.length;
        System.out.println(maxSubarraySumCircular1(a,n));
    }
}
