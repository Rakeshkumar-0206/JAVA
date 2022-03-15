import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
	   Scanner s= new Scanner(System.in);
	   System.out.println("ENTER THE NUMBER");
       int n=s.nextInt();
       int temp=n;
       int sum=0,r;
       while(n>0)
       {
           r=n%10;
           sum=sum+(r*r*r);
           n=n/10;
           
       }
       if(temp==sum)
       {
           System.out.println("ARMSTRONG NUMBER");
       }
       else{
           System.out.println("NOT ARMSTRONG NUMBER");
       }
