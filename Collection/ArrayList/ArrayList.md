                                                                                    ArrayList
    ArrayList is an Concrete class in java 
      -we can create object  for array list with help of array list we can read ,store ,remove and use the an object
      -we cannot able to modify the object
      -Arraylist present inside java.util package 
      -Fully qualified name of arrayList is java.util.ArrayList
      -we help of this arraylist we can store homogeneous and heterogeneous type of object
      -we cannot create object of array list directly we need to import it from util package
      ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
      eg 
      import java.util.ArrayList
      class p
      {
      public static void main(String [] args)
      {
      ArrayList obj=new ArrayList();
      System.out.println(obj); //tostring () is overriden so we don't get address here we get []
      }
      }

We can Make ArrayList As Homogeneous with help of angular brackets  or diamond brackets   <>

    class P2
    {
    public static void main(String[] args)
    {
    ArrayList <Integer> obj =new ArrayList <Integer> ();
    obj.add(10);
    obj.add(12);
    obj.add(14);
    System.out.println(obj);
    }
    }
        o/p: [10,12,14]
        by using  <Integer> we can store only homogeneous type of value in array


    
