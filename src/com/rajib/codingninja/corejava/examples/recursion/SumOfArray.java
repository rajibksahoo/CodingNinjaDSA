package com.rajib.codingninja.corejava.examples.recursion;

public class SumOfArray {

    public static int sum(int input[]) {
        if (input.length == 1) {
            return input[0];
        }
        //crate smaller array
        int[] smallerArray = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallerArray[i - 1] = input[i];
        }
        return input[0] + sum(smallerArray);
    }

    public static boolean checkNumber(int input[], int x) {
        if (input[0] == x) {
            return true;
        }

        if(input.length ==1 && input[0] != x){
            return false;
        }

        //crate smaller array
        int[] smallerArray = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallerArray[i - 1] = input[i];
        }
        return checkNumber(smallerArray, x);
    }

    public static void main(String[] args) {
        int[] input = new int[5];
        input[0] = 11;
        input[1] = 2;
        input[2] = 3;
        input[3] = 4;
        input[4] = 5;
        //System.out.println(sum(input));
        System.out.println(checkNumber(input, 9));
    }
}
