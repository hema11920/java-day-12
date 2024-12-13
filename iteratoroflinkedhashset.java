import java.util.*;
public class iteratoroflinkedhashset{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hello");
        a.add("hello");
        a.add("students");
        a.add("rajesh");
        a.add("students");
        //iterator
        for(String s:a)
        {
            System.out.print(s+" ");
        }
    }
}