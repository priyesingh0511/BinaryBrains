import java.util.*;
public class totalCost
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the cost of pencil : ");
      float pencil=sc.nextFloat();
      System.out.println("Enter the cost of pen : ");
      float pen=sc.nextFloat();
      System.out.println("Enter the cost of eraser : ");
      float eraser=sc.nextFloat();
      float tc=pen+pencil+eraser;
      System.out.println("Total cost of items = "+tc);
      float gst=(tc*18)/100;
      float total=tc+gst;
      System.out.println("Total cost of items after gst = "+total);
   }
}