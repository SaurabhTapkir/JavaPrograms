public class DataHiding_StudMain {
    public static void main(String[] args) {
        DataHiding_Stud obj=new DataHiding_Stud("Saurabh Tapkir",2,"pune"); 
        //System.out.println(obj.Name);-> it is not accessible we have tio create getter () 
        
        System.out.println("Using Getter:"+obj.get_studname());
        
        obj.set_studname("Rajat Kumar");
         System.out.println("Using Setter Updated Name :"+obj.get_studname());
        System.out.println("----Method Call Stst ----");
       obj.Stud_details();
    }
}
