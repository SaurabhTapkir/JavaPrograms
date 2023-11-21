import java.util.ArrayList;

public class ArrayList2Array {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add("laptop");
        obj.add(10);
        obj.add(true);
        
        System.out.println(obj);
        System.out.println();

        Object [] n=obj.toArray();
        //iterate by for()
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]);
        }

    }
}
