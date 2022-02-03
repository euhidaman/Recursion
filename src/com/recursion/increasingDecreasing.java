package com.recursion;

import java.util.Scanner;

public class increasingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        increasing(1,n);
        System.out.println("----------------");
        decreasing(n);
    }

    static void increasing(int i,int n)
    {
        if(i > n)
            return;

        System.out.println(i);
        increasing(i+1, n);
    }

    static void decreasing(int n)
    {
        if(n==0)
            return;

        System.out.println(n);
        decreasing(n-1);
    }
}
