class VoteCustomException
{
  public static void vote(int age) throws AgeInvalid
  {
    if(age>=18)
    {
      System.out.println("Eligible to Vote ");
    }
    else
    {
     // System.out.println("Not Eligible to Vote");
      /* if we are eligible to vote then if() execute if not then it will throw Exception so we create object 
      but 
      */
      throw new AgeInvalid("Not Eligible"); //we create own exception 
    }
  }
  public static void main(String[] args)
  { 
    System.out.println("main begins");
    try{
    vote(18);
    }
    catch(Throwable e){
      System.out.println(e);
      
    }
    System.out.println("main end");
  }
}


