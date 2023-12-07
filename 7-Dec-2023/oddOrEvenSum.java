import java.util.*;
public class oddOrEvenSum
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array : ");
      int n=sc.nextInt();
      int ar[]=new int[n];
      for(int i=0;i<n;i++)
      {
        System.out.println("Enter the element at index : "+i);
        ar[i]=sc.nextInt();
      }
      int se=0;
      int so=0;
      for(int i=0;i<n;i++)
      {
        if(ar[i]%2==0)
        {
            se=se+ar[i];
        }
        else
        {
            so=so+ar[i];
        }
      }
      System.out.println("Sum of Even numbers of array = "+se);
      System.out.println("Sum of Odd numbers of array = "+so);
   }
}