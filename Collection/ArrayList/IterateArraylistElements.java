import java.util.ArrayList;

class IterateArraylistElements {

    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add("Pen");
        obj.add(10);
        obj.add(true);
        System.out.println(obj.get(0)); // pen (get() is Nonstatic method)

    }
}
