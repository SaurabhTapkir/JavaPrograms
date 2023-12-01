public class DivideString {
   public static void main(String[] args)
   {
    String str="saurabh tapkir ";
    System.out.println(str);

    System.out.println("Split String :");
    
    String []str2=str.split(" ");
    
    //after spliting we need to store multiple string so
    // we take help of array
    for(int i=0;i<str2.length;i++)
    {
        System.out.println(str2[i]);
    }

   } 
}
