//Method 2 : Kunal Kushwaha

package binarySearchProblems;

public class infiniteArrayPos {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int ans = findAns(arr,10);

        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }

    static int findAns(int[] arr, int key)
    {
        int start=0, end=1;

        while(arr[end]<=key)
        {
            int newStart = end+1;
            end = newStart + ((end-start)*2)+1;
            start = newStart;
        }

        return bSearch(arr, start, end, key);
    }

    static int bSearch(int[] arr, int start, int end, int key)
    {
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]<key)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
}
