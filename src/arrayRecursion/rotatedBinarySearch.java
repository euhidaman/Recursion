package arrayRecursion;

import java.util.*;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        System.out.println(rotateBinSrch(arr, 0, arr.length-1, key ));
    }

    static int rotateBinSrch(int[] arr, int left, int right, int key)
    {
        if(left > right)
            return -1;


        int mid = (left + right)/2;
        // Element found;
        if(arr[mid] == key)
            return mid;

        // Element in left half
        if(arr[left] <= arr[mid])
        {
            if(arr[left]<=key && key<=arr[mid])
                return rotateBinSrch(arr, left, mid-1, key);
            else
                return rotateBinSrch(arr, mid+1, right, key);
        }

        // element in right half
        if(arr[mid]<=key && key<=arr[right])
            return rotateBinSrch(arr, mid+1, right, key);

        // element in unsorted left half
        return rotateBinSrch(arr, left, mid-1,  key);

    }
}
