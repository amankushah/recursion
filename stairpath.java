import java.util.*;
class stairpath
{
    public static int stair(int n)
    {
        if(n<=2) return n;
        return stair(n-1) + stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no. of stairs : ");
        int n=sc.nextInt();
        System.out.print("the no. of ways is : ");
        System.out.println(stair(n));
    }
}