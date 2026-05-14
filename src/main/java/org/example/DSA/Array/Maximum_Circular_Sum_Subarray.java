package org.example.DSA.Array;

public class Maximum_Circular_Sum_Subarray {
// A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].
     private static int maxSubarraySumCircular(int[] nums, int n) {

        int res = nums[0];
        for(int i=0;i<n;i++){
            int curr_sum = nums[i];
            int curr_max = nums[i];
            for(int j=1;j<n;j++){
                int index = (i+j)%n;
                curr_sum+=nums[index];
                curr_max = Math.max(curr_max,curr_sum);
            }
            //System.out.println(curr_max);
            res = Math.max(res,curr_max);
        }
        return res;
    } // O(n^2)

    public static void main(String[] args) {
        int[] a = {5,-2,3,4};
        int n = a.length;
        System.out.println(maxSubarraySumCircular(a,n));
        System.out.println(maxSubarraySumCircularOptimized(a,n));
    }

//  idea for optimized approach - O(N)
//    1. Maximum sum of normal subarray (kadan's algorithm')
//    2. Maximum sum of circular subarray

    private static int maxSubarraySumCircularOptimized(int[] arr, int n) {
        int maxNormal = kadansAlgoForMaxSum(arr, n);
        if (maxNormal < 0)
            return maxNormal;
        int arr_sum = 0;
        for (int i = 0; i < n; i++) {
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_circular =arr_sum + kadansAlgoForMaxSum(arr, n);
        return Math.max(max_circular, maxNormal);
    }

    private static int kadansAlgoForMaxSum(int[] arr, int n) {
        int sum = arr[0];
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            sum = Math.max(sum + arr[i], arr[i]);
            result = Math.max(result, sum);
        }
        return result;
    }
}
