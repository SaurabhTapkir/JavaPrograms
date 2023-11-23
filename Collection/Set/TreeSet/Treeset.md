                                                            Tree Set 
              It is Concrete Class It is child Of Set <I>
              Tree Set dosent allow duplicate object
              in Treeset we can pass Homogeneous  type of obj.
              It wiil automatically sort an object in ascending order 
              it is present inside java.util package
              fully Qualified name is java.util.TreeSet


              import java.util.TreeSet
              class prog
              {
              
              public static void main(String[] args)
             {

              TreeSet obj=new TreeSet();
              obj.add(1);
              obj.add(4);
              obj.add(2);
             obj.add(3);
             System.out.prinln(obj);
             } 
           }

        O/p:[1 2 3 4]


      *Note: if we pass heterogeneous type value inside TreeSet We get ClassCastException
             we can Handle it by using Exception Handling Mechanism
      
