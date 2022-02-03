package com.recursion;

import java.util.Scanner;

public class ProductofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(prodDig(num));
    }

    static int prodDig(int num)
    {
        if(num == 0)
            return 1;

        return (num%10)*prodDig(num/10);
    }
}
