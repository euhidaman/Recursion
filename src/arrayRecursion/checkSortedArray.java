package arrayRecursion;

import java.util.Scanner;

public class checkSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(check(arr,0));
    }

    static boolean check(int[] arr, int ind)
    {
        if(ind == arr.length-1)
            return true;

        if(arr[ind] < arr[ind+1])
            return check(arr, ind+1);
        else
            return false;
    }
}
