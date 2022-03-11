import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int[][] a=new int[10][10];
        int[][] b=new int[10][10];
        int[][] m=new int[10][10];
        System.out.println("First matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Second matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("MUl=");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            
                
                m[i][j]+=a[i][j]*b[i][j];
                System.out.printf("%d ",m[i][j]);
            }
                System.out.printf("\n");
                
            }
            
        }
}
