/*
 StringIndexOutOfBoundsException :
 When we try to access Character based on index value and index value 
 is greater or equal to length of given String(len=5)

 */
class SIOBE {
    public static void main(String[] args)
    {
        String str = "Hello";
        System.out.println(str.length());
        System.out.println(str.charAt(0)); //H
        
        //exception occurs bcoz we have index value start from 0 to 4 . in above string 
        // there is no value on 5th index
        System.out.println(str.charAt(5));
         
    } 
    
}
