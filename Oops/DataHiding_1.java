//it constains Non static members
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

    // to read use getter()
   public String get_studname()
    {
      return this.Name;
    }
    
    //to modify Use Setter()
   public void set_studname(String n)
    {
       this.Name=n;
    }
    // non static method for display details
    public void Details()
    {
      System.out.println("Student Name"+this.Name);
      System.out.println("Student Rollno"+this.Rollno)
      System.out.println("Student Address"+this.Address);
      System.out.println(""+this.Name);
  }
  }

