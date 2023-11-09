public class SOError {
    public static void sum(int a,int b)
    {
        int res=a+b;
        System.out.println(res);
        sum(3,4);
    }
    public static void main(String[] args)
    {
        try{
        sum(3,4);
        }
        catch(Throwable t)
            {
            System.out.println(t);
            }
    }
}
