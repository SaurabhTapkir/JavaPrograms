//it is Simple Vote Program Need to understand about CustomException
class Voting
{
  //create one method
public static void vote(int age)
  {
    if(age>=18)
    {
      System.out.println(" Eligible To vote");
    }
    else
    {
      System.out.println("Not Eligible To vote");
    }
  }
public static void main(String[] args)
  {
    //method Call Stmt
    vote(18);
  }
}

