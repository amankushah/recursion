class printsubsets
{
    public static void print(int i, String s, String ans)
    {
        if(i==s.length())
        {
        System.out.println(ans);
        return;
        }
        char ch=s.charAt(i);
        print(i+1,s,ans+ch); //take
        print(i+1,s,ans); //not take


    }
    public static void main(String[] args) 
    {
        String s="amanshah";
        print(0,s," ");
    }
}