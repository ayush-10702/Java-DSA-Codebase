package com.ak.Arrays.ArrayQuestion;

public class MajorityElement {
    //using Moore Voting Algorithm
    //Assumption:- majority element occurs more than n/2 times
    public static int majorityElement(int[] nums) {
        //Using Moore Voting Algorithm
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
