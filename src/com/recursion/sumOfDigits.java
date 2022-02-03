package com.recursion;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(sumDig(num));
    }

    static int sumDig(int num)
    {
        if(num == 0)
            return 0;

        return (num%10)+ sumDig(num/10);
    }
}
