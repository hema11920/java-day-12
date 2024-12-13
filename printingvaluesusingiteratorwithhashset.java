import java.util.*;
public class printingvaluesusingiteratorwithhashset{
    public static void main(String args[]){
        HashSet<String> a=new HashSet<>();
        a.add("hello");
        a.add("hello");
        a.add("students");
        a.add("rajesh");
        a.add("students");
        //printing using iterator
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}