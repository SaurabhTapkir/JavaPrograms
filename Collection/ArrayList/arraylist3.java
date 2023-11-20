import java.lang.reflect.Array;
import java.util.ArrayList;

public class arraylist3 {
    public static void main(String[] args) {

        ArrayList obj = new ArrayList();
        System.out.println(obj);
        System.out.println(obj.isEmpty());

        // adding objects which contains elements
        obj.add(123);
        obj.add("hello");
        obj.add('a');

        System.out.println(obj);
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
        System.out.println(obj.contains("hello"));
        System.out.println();

        // second arraylist
        ArrayList obj2 = new ArrayList(obj);

        System.out.println(obj2);
        System.out.println(obj2.isEmpty());
        System.out.println(obj2.containsAll(obj));

        obj2.addAll(obj);// it addall object of arraylists
        System.out.println(obj2);

        //get () is use to get particular element based on index value
         
         System.err.println(obj2.get(0)); 
        obj2.clear();
        System.out.println(obj2);
    }

}