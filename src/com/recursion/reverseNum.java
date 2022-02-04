package com.recursion;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        reverse(num);
        System.out.println(sum);

        System.out.println("------------------");
        int count = (int)Math.log10(n);
        System.out.println(reverse2(n, count));
    }

    static int reverse2(int n, int count)
    {
        if(n%10==n)
            return n;

        int rem = n%10;
        int val = rem*(int)Math.pow(10, count);

        return val+reverse2(n/10, count-1);
    }

    static int sum = 0;
    static void reverse(int n)
    {
        if(n==0)
            return;

        int rem = n%10;
        sum = sum*10+rem;

        reverse(n/10);
    }
}
