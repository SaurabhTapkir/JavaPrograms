import java.lang.reflect.Array;
import java.util.ArrayList;
public class arraylist1 {
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
        

        ArrayList obj2=new ArrayList();
        obj2.add(obj);
        System.out.println(obj.isEmpty());
        




    }
    
}