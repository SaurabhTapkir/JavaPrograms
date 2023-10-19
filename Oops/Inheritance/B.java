
 class B extends A {
    static int b=20;
public static void main(String[] args)
{
System.out.println("Value of B of class B :"+b);

//try to access class name as ref
System.out.println("Value of A of class A Inside Class B :"+A.a);

/*
    without class name as ref
    System.out.println("Value of B of class B :"+a); //Compile Time Error
 */

 //to access vari a from class B directly we use extends

System.out.println("After extends Access value directly :"+a);
}    
}
