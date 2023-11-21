                                                                            Vector
-we can create object  for array list with help of array list we can read ,store ,remove and use the an object
  -we cannot able to modify the object
  -Vector present inside java.util package 
  -Fully qualified name of arrayList is java.util.Vector
  -we help of this arraylist we can store homogeneous and heterogeneous type of object
  -we cannot create object of array list directly we need to import it from util package
  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  eg 
  import java.util.Vector
  class p1
  {
  public static void main(String [] args)
  {
  Vector obj=new Vector();
  System.out.println(obj); //tostring () is overriden so we don't get address here we get []
  }
  }

  Question :
    How to Make Vector is Homogenous ?
      we can make Vector as Homogeneous by using <> Angular brackets or diamond brackets
          import java.util.Vector
          class p1
         {
          public static void main(String [] args)
          {
          Vector <Integer> obj=new Vector<Integer>();
          obj.add(10);
          obj.add(20);
          System.out.println(obj); //tostring () is overriden so we don't get address here we get []
          }
        }
