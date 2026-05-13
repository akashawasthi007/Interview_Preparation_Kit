package org.example.DSA.Array;

public class Longest_Even_Odd_Subarray {

    static int longestEvenOddSubarray(int[] a, int n)
    {
        int ans = 1,count=1;
        for(int i=0;i<n-1;i++){
            // bitwise & it 1 gives 1 for odd and 0 for even.
            //sum oiof even and odd number is always odd.
            if(((a[i]+a[i+1])&1)==1){
                ans = Math.max(ans,count++);
            }
            else
                count=1;
        }

        return ans+1;
    }

    public static void main(String args[])
    {
        int[] a = {5,10,20,6,3,8};
        int n = a.length;
        System.out.println(longestEvenOddSubarray(a, n));
    }
}
