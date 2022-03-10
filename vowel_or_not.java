import java.util.*;
class Main {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println(ch);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
        {
            System.out.println("vowel");
        }
        else if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
        {
            System.out.println("constant");
        }
        else
        {
            System.out.println("error");
        }
    }
}
