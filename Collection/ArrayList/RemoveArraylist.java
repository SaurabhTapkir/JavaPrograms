
/*
 * Remove() :it has two behaviour we can remove by passsing val or by passing indexVal
 */
import java.util.ArrayList;
import java.util.Collections;

public class RemoveArraylist {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add(11);
        obj.add(10);
        obj.add(1);
        obj.add(5);
        obj.add("dog");

        System.out.println("Original Arraylist:\n" + obj);
        obj.remove(0);
        System.out.println("After Remove() Arraylist:\n" + obj);
       
        obj.remove(Integer.valueOf(11));
        System.out.println("Integer.valueOf():\n"+obj);

        obj.remove("dog");
        System.out.println("Passing Value\n"+obj);


    }

}
