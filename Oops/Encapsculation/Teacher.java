//Write program for encapsculation of college(main) and teacher
class Teacher {
   private int TotalTeacher;
    

    // to access private int from Teacher to College use Getter 
    public int getInfo()
    {
        return TotalTeacher;
    }
    //to change private value use setter method
    public void setInfo(int i)
    {
        this.TotalTeacher=i;
    }

    Teacher() {
        TotalTeacher=10;
        System.out.println("Teacher(Constructor())");
    }
}