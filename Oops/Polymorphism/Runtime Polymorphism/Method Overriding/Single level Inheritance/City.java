public class City {
public static void main(String[] args)
{
    //object creation 
    Sbi sbi =new Sbi();
    System.out.println(sbi);
    System.out.println(sbi.roi());
    // upcasting ->convert addr from Child to parent
     Bank b=sbi; 
     System.out.println(b.roi());
}
}
