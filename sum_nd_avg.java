import java.util.*;
class Main
{


 public static void main(String[] args)
  {

 
     Scanner s= new Scanner(System.in);
     int n=s.nextInt();
     int[] arr=new int[n];
     int sum=0;
     for(int i=0;i<n;i++)
     {
         arr[i]=s.nextInt();
     }
     for(int i=0;i<n;i++)
     {
         
     sum=arr[i]+sum;
     
     
     }
     System.out.println("the value of sum is "+sum);
     int avg=sum/n;
     System.out.println("the value of average is "+avg);
   }
}
 
