 class Developer extends Employee{
public static void main(String[] args)
{
//create object of current class developer
Developer dev=new Developer();
System.out.println(dev);

dev.staff();
dev.developer();

System.out.println("Salary of Developer:"+dev.salary);
System.out.println("Min. age of Developer:"+dev.MinAge);

}    
}
//class developer extends Employee