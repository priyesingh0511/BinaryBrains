import java.util.*;
class removeDuplicate 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element at index: "+i);
            ar[i]=sc.nextInt();
        }
        int a2[]=new int[n];
        int j=0;
        for (int i=0;i<n-1;i++)
        {
            if (ar[i]!=ar[i+1])
            {
                a2[j++]=ar[i];
            }
        }
        a2[j++]=ar[n-1];
        System.out.println("Sorted Array: ");
        for (int i=0;i<j;i++)
        {
            System.out.println(a2[i]+"\t");
        }
    }
}    

