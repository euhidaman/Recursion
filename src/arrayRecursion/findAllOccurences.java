package arrayRecursion;

import java.util.*;

public class findAllOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        getAll(arr, 0, key);
        
        if(res.size() == 0)
            System.out.println("Element not in array");
        else
            System.out.println(res);
    }

    static ArrayList<Integer> res = new ArrayList<>();

    static void getAll(int arr[], int index, int key)
    {
        if(index == arr.length)
            return;

        if(arr[index] == key)
            res.add(index);

        getAll(arr, index+1, key);
    }
}
