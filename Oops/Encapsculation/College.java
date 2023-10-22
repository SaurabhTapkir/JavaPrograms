class College{
    public static void main(String[] args) {
        // create object for Teacheer
        Teacher t=new Teacher();
         // System.out.println(t.Tid+" "+t.Tname); CTE Due to private var
         System.out.println(t.getInfo());

         //to change  private Value:
         t.setInfo(20);
         System.out.println(t.getInfo());
        }
}