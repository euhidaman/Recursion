package com.recursion;

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        System.out.println("Checking palindrome -->");
        int count = (int)Math.log10(n);
        System.out.println(num== reverseNum(n, count));
    }

    static int reverseNum(int n, int count)
    {
        if(n%10==n)
            return n;

        int rem = n%10;
        int val = rem*(int)Math.pow(10, count);

        return val+ reverseNum(n/10, count-1);
    }

}
