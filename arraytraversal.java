class arraytraversal
{
    public static void print(int i, int arr[])
    {
        if(i==arr.length) return;
        System.out.print(arr[i]+",");
        print(i+1,arr);

    }
    public static void main(String[] args) 
    {
        int arr[]= {3,4,5,6,2,3,1,4};
        print(0,arr);
    }
}