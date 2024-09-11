import java.util.*;
class gcd
{
    public static int gcdrec(int a, int b)
    {
        if(b%a==0) return a;
        return gcdrec(b%a , a);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the 1st no. : ");
        int a=sc.nextInt();
        System.out.print("enter the 2nd no. : ");
        int b=sc.nextInt();
        System.out.println(gcdrec(a,b));
    }
}