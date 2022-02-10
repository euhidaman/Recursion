package patterns;

import java.util.Scanner;

public class lowerTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(0,0,n);
    }

    static void pattern(int row, int col, int total)
    {
        if(row==total)
            return;

        if(row>=col)
        {
            System.out.print("*");
            pattern(row, col+1, total);
        }
        else
        {
            System.out.println();
            pattern(row+1, 0, total);
        }

    }
}
