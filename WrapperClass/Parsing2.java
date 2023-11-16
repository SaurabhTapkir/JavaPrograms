/*
To COnvert String TYpe to its repsresent primitive type we need
parse() method
in every wrapper class there is respective parse()

*/
public class Parsing2 {
    public static void main(String[] args)
    {
        String s="1000";
        int a=Integer.parseInt(s);
        
        
        System.out.println(a);
        System.out.println(a+12);//this is string
        
               System.out.println();
               
        System.out.println(a);      
        System.out.println(a+10);//To prove This is int  
    }
    
}
