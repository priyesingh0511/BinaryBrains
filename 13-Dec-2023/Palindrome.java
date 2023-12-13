import java.util.*;
class Solution {
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        if(x<0)
            System.out.println("Not a palindrome number");
        else
        {
            int num=x;
            int sum=0;
            while(num!=0)
            {
                int rem=num%10;
                sum=(sum*10)+rem;
                num/=10;
            }
            if(sum==x)
                System.out.println("Palindrome number");
            else
                System.out.println("Not a palindrome number");
        }
    }
}