package com.recursion;

import java.util.Scanner;

public class countZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(zero(num, 0));
    }

    static int zero(int num, int count) {

        if(num%10 == num)
            return count;

        int r = num%10;
        if(r==0)
            return zero(num/10, count+1);
        else
            return zero(num/10, count);
    }

}
