/*
 * Parsing : process of converting primitive datatype into String and String to its original 
 * or respective primitive is known as Parsing
 * - To convert primitive value into string type we need to use valueOf() which present inside String Class
 * -valueOf() is overloaded inside String class for primitve
 */
class Parsing {

    public static void main(String[] args) {
        boolean b= true;
        //parsing primitive to non primitive
        String str=String.valueOf(b);
    }
}
