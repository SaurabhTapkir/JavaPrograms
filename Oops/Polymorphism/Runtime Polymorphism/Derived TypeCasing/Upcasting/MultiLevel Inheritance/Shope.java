//This class we can import all other class and create object 
class Shope {
    public static void main(String[] args) {
        // object creation
        Redmi r = new Redmi();
        System.out.println(r);
        r.call();// own class
        r.sim();
        r.camera();
        System.out.println();
        
        Mobile m=r;
        System.out.println(m);
        m.sim();
        m.camera();
        System.out.println();
        
        Device d= m;
        System.out.println(d);
        d.camera(); //own class only
        
        

    
}}
