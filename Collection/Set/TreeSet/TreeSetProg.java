import java.util.TreeSet;
public class TreeSetProg {
public static void main(String[] args) {
    TreeSet obj=new TreeSet();
    obj.add(1);
    obj.add(4);
    obj.add(2);
    obj.add(2);
    obj.add(3);
    System.out.println("TreeSet :"+obj);
    obj.remove(Integer.valueOf(0));
    System.out.println("remove()"+obj);

}
    
}