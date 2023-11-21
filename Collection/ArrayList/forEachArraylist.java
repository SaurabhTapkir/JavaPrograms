import java.util.ArrayList;

public class forEachArraylist {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        obj.add(20);
        obj.add("a");
        obj.add(true);

        for(Object var :obj)
        {
            System.out.println(var);
        }
    }
}
