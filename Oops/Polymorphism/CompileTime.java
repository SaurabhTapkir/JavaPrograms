class CompileTime{
    int a;
    //method Overloading
    static void demo()
    {
        System.out.println("demo()");
    }
    static void demo(int n)
    {
        
        System.out.println("demo(int)");
    }

    //constructor Overloading

    CompileTime()
    {
        System.out.println("CompileTime () NoArgs Constructor");
    }

    CompileTime(int n)
    {
       
        this.a=n;
        System.out.println("Compile Time (int ) Parameterized Constructor");
    }

    public static void main(String[] args) {
        //object creation 
        CompileTime ct = new CompileTime();
CompileTime ct2 = new CompileTime(10);

        //method call statment 
        demo();
        demo(10); 
    }

}