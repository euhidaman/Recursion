package com.recursion;

import java.util.Scanner;

public class binarySearch {

    static int bSearch(int[] arr, int left, int right, int target)
    {
        int mid=(left+right)/2;

        if(left <= right)
        {
            if (arr[mid]==target) {
                return mid;
            }
            else if(arr[mid]>target)
            {
                return bSearch(arr,left, mid-1,target);
            }
            else if(arr[mid]<target)
            {
                return bSearch(arr, mid+1,right,target);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key : ");
        int key = sc.nextInt();

        System.out.println("Element at : "+bSearch(arr, 0, arr.length-1, key));
    }
}