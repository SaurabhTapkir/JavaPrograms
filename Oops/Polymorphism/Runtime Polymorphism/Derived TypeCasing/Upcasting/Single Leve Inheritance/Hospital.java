class Hospital {
    // object create for child Doctor
    public static void main(String[] args) {
        Doctor d = new Doctor();
        System.out.println(d);
        d.treat();// member of its own class
        d.sleep();// member of its parent
        d.maxLife(); // member of its parent
        System.out.println("-----------------");
        // so from above we say child can access its parent class member easily

        
        // upcasting from Doctor to Human
        Human h = d;
        System.out.println(h);
        h.sleep();// member of its own class
        h.maxLife();// member of its own class
       //  h.job(); CTE
    }
}
