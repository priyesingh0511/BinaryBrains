import java.util.*;
class PosOrNeg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.println("Number is positive");
        }
        else if(n==0){
            System.out.println("Number is 0");
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
}