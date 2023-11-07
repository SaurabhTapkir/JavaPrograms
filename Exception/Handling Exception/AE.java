class AE
{
    public static void main(String[] args) {
        
        System.out.println("Main Begins");
        int n=10;
        int m=0;
  
        try
        {
            int ans=n/m;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Main End");
        
    }
}