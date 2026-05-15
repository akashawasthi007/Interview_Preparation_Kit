package org.example.DSA.Array;

// Boyer - Moore Majority Voting Algorithm -> Optimized approach
// gives you middle occurence of the element
public class Majoriy_element {
    public static void main(String[] args) {
        int[]  arr = {2,2,1,1,1,2,2};
        System.out.println("Majoriy element is : "+findMajorityElement(arr,arr.length));
    }

// works in 2 parts-
// first identify that which element is in maximum times of the array
    private static int findMajority(int[] arr, int length) {
        int count = 1;
        int major = arr[0];
        for(int i=0;i<length;i++){
            if(arr[i]==major){
                count++;
            }
            else
                count--;
            if(count==0){
                major = arr[i];
                count=1;
            }
        }
        return major;
    }

// second identifies that the element is in majority or not
    private static int findMajorityElement(int[] arr, int length) {
        int major = findMajority(arr,length);
        int count = 1;
        for(int i=0;i<length;i++){
            if(arr[i]==major){
                count++;
            }
        }
        if(count>length/2)
            return major;
        else return -1;
    }
}






