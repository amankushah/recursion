import java.util.*;
class mazepath
{
    public static int maze(int row, int col, int m , int n)
    {
        if(row==m || col==n) return 1;
        int rightway=maze(row,col+1,m,n);
        int downway=maze(row+1,col,m,n);
        return rightway + downway;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no. of rows : ");
        int m=sc.nextInt();
        System.out.print("the no. of columns : ");
        int n=sc.nextInt();
        System.out.println(maze(1,1,m,n));
    }
}