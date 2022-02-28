package binarySearchProblems;

import java.util.Arrays;

public class sortedRowColMatrix {

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int[] res = search(arr, 2);
        System.out.println(Arrays.toString(res));
    }

    static int[] search(int[][] mat, int key)
    {
        int row = 0;
        int col = mat.length-1;

        while(row< mat.length && col>=0)
        {
            if(mat[row][col] == key)
            {
                return new int[]{row, col};
            }
            else if(mat[row][col] < key)
                row++;
            else
                col--;
        }

        return new int[]{-1, -1};
    }
}
