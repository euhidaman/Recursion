package arrayRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class findAllOccRecList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        ArrayList<Integer> ans = getAll(arr, 0, key);

        if(ans.size() == 0)
            System.out.println("Element not in array");
        else
            System.out.println(ans);
    }

    static ArrayList<Integer> getAll(int[] arr, int index, int key)
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(index == arr.length) {
            return res;
        }

        if(arr[index] == key)
            res.add(index);

        ArrayList<Integer> val = getAll(arr, index+1, key);

        for (int i = 0; i < val.size(); i++) {
            res.add(val.get(i));
        }

        return res;
    }
}
