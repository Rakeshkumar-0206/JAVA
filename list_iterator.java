import java.util.*;
class Main
{
    public static void main(String[] args)
    {
     Collection<String>list=new ArrayList<String>();
     list.add("hi");
     list.add("how");
     list.add("are");
     list.add("you?");
     System.out.println("the list is:"+list);
     Iterator itr=list.iterator();
     while(itr.hasNext()){
         System.out.println(itr.next());
     }
    
        
        
    }
}
