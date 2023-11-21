/*
 * Can we make Arraylist as homogeneous
 */

import java.util.ArrayList;

public class HomogeneousArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<Integer>();
        obj.add(20);
        obj.add(25);
        obj.add(200);

        // print all element present inside object

        for (Object var : obj) {
            System.out.println(var);
        }

    }
}
