class Login
  {
    public static void input(String username) throws LoginException
    {
      if(username=="SaurbhTapkir")
      {
        System.out.println( username+" Login Successfully...");
      }
      else
      {
       throw new LoginException(username +"is Invalid Username ");
      }
    }
    public static void main(String[] args)
    {
      try
        {
          input("SaurabhTapkir");    
        }
      catch(LoginException e)
        {
        System.out.println(e)
        }
      
    }
  }
