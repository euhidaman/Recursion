package arrayRecursion;

import java.util.*;

public class findAllOccRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        ArrayList<Integer> res = getAll(arr, 0, key, new ArrayList<>());

        if(res.size() == 0)
            System.out.println("Element not in array");
        else
            System.out.println(res);
    }

    static ArrayList<Integer> getAll(int[] arr, int index, int key, ArrayList<Integer> res)
    {
        if(index == arr.length)
            return res;

        if(arr[index] == key)
            res.add(index);

        return getAll(arr, index+1, key, res);
    }
}
