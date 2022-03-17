import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int n = s.nextInt ();
    int i, j;

    for (i = 1; i <= (n * 2 - 1); i++)
      {


	if (i == n)
	  {
	    for (j = 1; j <= (n * 2 - 1); j++)
	      {
		System.out.printf ("*");
	      }
	  }
	else
	  {
	    for (j = 1; j <= n - 1; j++)
	      {
		System.out.printf (" ");
	      }
	    System.out.printf ("*");
	  }

	System.out.printf ("\n");
      }

  }
}
