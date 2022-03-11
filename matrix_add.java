import java.util.*;
class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    
    int a = s.nextInt ();
    int b = s.nextInt ();
    int c = s.nextInt ();
    int d = s.nextInt ();

    int[][] arr = new int[a][b];
    int[][] brr = new int[c][d];
    int[][] crr = new int[c][d];

	for (int i = 0; i < a; i++)
	  {
	    for (int j = 0; j < b; j++)
	      {
		arr[i][j] = s.nextInt ();
	      }

	  }
	for (int i = 0; i < c; i++)
	  {
	    for (int j = 0; j < d; j++)
	      {
		brr[i][j] = s.nextInt ();

	      }
	  }
	for (int i = 0; i < a; i++)
	  {
	    for (int j = 0; j < d; j++)
	      {
		for (int k = 0; k < b; k++)
		  {
		    crr[i][j] = arr[i][j] + brr[i][j];
		  }
	      }
	  }
    for (int i = 0; i < a; i++)
      {
	for (int j = 0; j < d; j++)
	  {
	    System.out.print (crr[i][j] + " ");
	  }
	System.out.println ("");
      }
  

}
}
