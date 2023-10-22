public class EmployeeDetails {
   public static void  main(String[] args)
    {
        Employee emp= new Employee();
        System.out.println(emp);
        //    emp.E_ID=11; ->CTE
        //   System.out.println(emp.E_ID); ->CTE

        // Storing and printing  private var
        int id=emp.getId();
        System.out.println(id);

        //set other value
        emp.setID(20);
        System.out.println(emp.getId());

    }
}
