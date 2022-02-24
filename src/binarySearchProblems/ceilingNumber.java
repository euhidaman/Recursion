package binarySearchProblems;

import java.util.*;

public class ceilingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        boolean found=false;
        int left=0, right= arr.length-1;

        while(left<=right)
        {
            int mid=(right+left)/2;
            if(arr[mid]==key)
            {
                System.out.println(arr[mid]);
                found=true;
                break;
            }
            else if(arr[mid]<key)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }

        if(!found)
        {
            System.out.println(arr[left]);
        }
    }
}
