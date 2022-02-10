package patterns;

import java.util.*;

public class upperTriangle {
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
            System.out.print("*");
            pattern(row, col+1);
        }
        else
        {
            System.out.println();
            pattern(row-1,0);
        }
    }
}
