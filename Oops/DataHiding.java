class DataHiding
  {
    //Non static Variable:
   private  String Name;
    int RollNo;
    String Address;

//parameterized Constructor
    DataHiding(String name,int rollno,String addrs)
    {
      this.Name=name;
      this.RollNo=rollno;
      this.Address=addrs;
    }
    
    //main():
    public static void main(String[] args)
    {
    DataHiding obj= new DataHiding("Saurabh Tapkir",2,"India");
      System.out.println(obj.Name);
    }
  }
//op :Saurabh Tapkir
/*
If we use private keyword to any variable inside its own class we cannot able to hide that vari we can still easily access 
so crete two different class
  */




