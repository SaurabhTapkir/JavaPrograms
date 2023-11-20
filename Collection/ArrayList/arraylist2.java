import java.lang.reflect.Array;
import java.util.ArrayList;
public class arraylist2 {
    public static void main(String[] args) {
     
        ArrayList obj =new ArrayList();
        System.out.println(obj);
        System.out.println(obj.isEmpty());

        //adding objects which contains elements
        obj.add(123);
        obj.add("hello");
        obj.add('a');

        System.out.println(obj);
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
        System.out.println(obj.contains("hello")); 
        System.out.println();

        //second arraylist
        ArrayList obj2=new ArrayList(obj);
        
        System.out.println(obj2);
        System.out.println(obj2.isEmpty());
        System.out.println(obj2.containsAll(obj)); 

        ArrayList obj3=new ArrayList();
        obj3.add(obj2);
        obj3.add("22");
        System.out.println(obj3);
        obj3.add(0,"saurbh");
        System.out.println(obj3);





    }
    
}