class NPE{
    public static void main(String[] args) {
        System.out.println("main Begins");
        int a[] =null;
        System.out.println(a.length);
       
        String str=null;
        System.out.println(str.length());
        System.out.println("main ends");
    }
}