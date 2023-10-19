//it is parent of Class B
//class A and B are connected to each other

class A{
    static int a=10;
    public static void main(String[] args) {
    System.out.println("Value of A of Class A:"+a);
    
    // System.out.println(b);Compile time error we parent can't access child  directly
        
    }

}