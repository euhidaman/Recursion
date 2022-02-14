package patterns;

import java.util.Scanner;

public class lowerTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n,0);
    }

    static void pattern(int row, int col)
    {
        if(row==0)
            return;

        if(col<row)
        {
            pattern(row, col+1);
            System.out.print("*");
        }
        else
        {
            pattern(row-1,0);
            System.out.println();
        }
    }
}
