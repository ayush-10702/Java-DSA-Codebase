package com.ak.BitManipulation;

public class SetTheIthBit {
    public static void main(String[] args) {
        //if 0->1
        //if 1->0

        // just do OR with  the kth bit
        int n=9;
        int k=3;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n|(1<<k-1)));
    }
}
