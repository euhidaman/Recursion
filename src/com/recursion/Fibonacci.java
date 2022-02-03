package com.recursion;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i)+" ");
        }
    }

    static int fibo(int n)
    {
        if(n<=1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
}
