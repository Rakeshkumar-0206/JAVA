import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	   
	    int i=0,j=0,count=0;
	    int[] arr=new int[10];
	    for(i=0;n>0;i++)
	    {
	        arr[i]=n%2;
	        n=n/2;
	    }
	    for(i=i-1;i>=0;i--)
	    {
	        System.out.printf("%d",arr[i]);
	    }
	    System.out.println("\n");
	     int m=s.nextInt();
	     int[] brr=new int[10];
	      for(j=0;m>0;j++)
	    {
	        brr[j]=m%2;
	        m=m/2;
	    }
	       for(j=j-1;j>=0;j--)
	    {
	        System.out.printf("%d",brr[j]);
	    }
	    System.out.println("");
	    for(i=0;i<8;i++){
	    if(arr[i]!=brr[i])
	    {
	        count++;
	    }
	    }
	    System.out.println(count);
	}
}
