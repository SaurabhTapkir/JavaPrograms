import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSetProg2 {
    public static void main(String[] args) {
        TreeSet obj = new TreeSet();

        obj.add("Cat");
        obj.add("Dog");
        obj.add("Monkey");
        obj.add("Donkey");

        System.out.println("TreeSet :" + obj);
        obj.remove("Cat");// pass value
        System.out.println("Remove() :" + obj);

        obj.remove(String.valueOf(0));
        System.out.println("valueOf():" + obj);

        System.out.println(obj.contains("cat"));
        System.out.println(obj.containsAll(obj));

        // Converting TreeSet to Array List
        /*
         * here we need to pass ref var of TreeSet in ArrayList
         */

        ArrayList obj2 = new ArrayList(obj); // obj2.add(obj) is also Valid
        Collections.sort(obj2);
        System.out.println("sort():" + obj2);
        Collections.reverse(obj2);
        System.out.println("Reverse():" + obj2);

    }

}