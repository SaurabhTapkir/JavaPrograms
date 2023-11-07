                                                                    <h3>Exception Handling Mechanism</h3>
                                                                    
A mechanism use to handle Exception is called as Exception Handling Mechanism
we can use these Exception Handling Mechanism for both cheked and unchecked Exception

Syntax: 
    try
    {
    // statement;
    }
    catch(class_name var_name)
    {
    // statements;
    }
  above structure is use to handle exception , and our program execute successfully.
-----------------------------------------------------------------------------------------------------

try:
    it is responsible to create an exception.those set of statement has to be written inside try block
    try block will throw an throwable type of object (address of exception ) catch block
Catch block:
    it is used to catch Throwable type of object which given by try block
    if exception caught Execution of program will continue.
                        *Catch Block Use To HANDLE EXCEPTION*
-----------------------------------------------------------------------------------------------------
  
    class HandleSIOBE {
        
        public static void main(String[] args)
        {
            System.out.println("String IndexOutOfBoundsException is there");
            String str="java";
        
            StringIndexOutOfBoundsException s= new StringIndexOutOfBoundsException();
            
            try
            {
            System.out.println(str.charAt(5));
            }
            catch(Throwable e){System.out.println(e);}
            catch(Exception ee){System.out.println(ee);}
        
            
            System.out.println("String IndexOutOfBoundsException Handle");
        }
    }
Above Program throw an Exception:
Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        Unreachable catch block for Exception. It is already handled by the catch block for Throwable
        at HandleSIOBE.main(HandleSIOBE.java:15)
this is because we declare Exception class which is child of Throwable class so address of Given exception is already present in exception 
                        
