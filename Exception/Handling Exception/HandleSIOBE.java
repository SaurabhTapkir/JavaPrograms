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
