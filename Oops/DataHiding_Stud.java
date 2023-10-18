// in this class we are use private nsv
 class DataHiding_Stud {

   private String Name;
    int Id;
    String Address;

    //non static method
    DataHiding_Stud(String name,int id,String add)
    {
        //initialization 
        //initialize values from local to non static vari
        
        this.Name=name;
        this.Id=id;
        this.Address=add;
    }

    //as we make private name vari we have to create getter () 
        public String get_studname()
        {
            return this.Name;
        }

    public void set_studname(String n)
    {
        this.Name=n;
    }
    public void Stud_details()
    {
        System.out.println("***Student Details**");
        System.out.println("Student Name :"+Name);
        System.out.println("Student Id: "+Id);
        System.out.println("Student Address:"+Address);
    }

}
