class Health {

    public static void main(String [] args)
    {
        // create object of child Classes
        Cricket c= new Cricket();
        System.out.println("Cricket :-"+c);
        c.umpires();
        c.teams();
        System.out.println();

        //passing address to parent class
        Sports s=c;
        System.out.println("Sports :-"+s);
        s.teams();
        System.out.println();


        Hockey h= new Hockey();
        System.out.println("Hockey :-"+h);
        h.player();
        h.teams();
        System.out.println();
        
        System.out.println("Pasing addre of hockey to Sports");
        s=h;
        System.out.println("from Hockey to sport :-"+s);
        s.teams();
        //s.player(); error

        
    }
}
