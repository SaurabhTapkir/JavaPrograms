 //main():
class DataHiding_Main{
    public static void main(String[] args)
    {
    DataHiding obj= new DataHiding("Saurabh Tapkir",2,"India");
     // System.out.println(obj.Name);// it will not work
     System.out.println(obj.get_studname()); //Saurabh Tapkir

     obj.set_studname("Rajat kumar");
     System.out.println(obj.get_studname()); 

    }
}
