package com.rajib.codingninja.corejava.examples.recursion;

public class MathUtility {

    public static int power(int x, int n ){
        // x^n
        if(n==1){
            return x;
        }
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        return x*power(x,n-1);
    }

    public static void print(int n) {
        if(n==1){
            System.out.print(1);
            return;
        }
        print(n-1);
        System.out.print(" "+n);
    }

    public static int count(int n) {
        int count = 0;
        if(n<10){
            return 1;
        }
        return count(n/10)+1;

    }

        public static void main(String[] args) {
        //System.out.println(power(3,4));
        //System.out.println(power(5,0));
        //print(6);
            System.out.println(count(1565));
    }
}
