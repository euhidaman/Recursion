package arrayRecursion;

import java.util.Scanner;

public class linearSearchRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();

        int found = linear(arr, 0, num);
        if(found == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at "+(found+1));
    }

    static int linear(int[] arr, int ind, int num)
    {
        if(ind == arr.length-1)
        {
            if(arr[ind] == num)
                return ind;
            return -1;
        }

        if(arr[ind] == num)
            return ind;
        return linear(arr, ind+1, num);
    }
}
