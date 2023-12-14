import java.util.*;
class searchInsert
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int ar[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the element at index: "+i);
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search:");
        int k=sc.nextInt();
        for(i = 0; i < n; i++)
        {
            if (ar[i] == k)
                break;
            else if (ar[i] > k)
                break;
        }
        System.out.println("Index = "+i);
    }
}