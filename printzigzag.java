import java.util.*;
class printzigzag
{
    public static void zigzag(int n)
    {
        if(n==0) return;
        System.out.print(n);
        zigzag(n-1);
        System.out.print(n);
        zigzag(n-1);
        System.out.print(n);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the n : ");
        int n=sc.nextInt();
        zigzag(n);
    }
}