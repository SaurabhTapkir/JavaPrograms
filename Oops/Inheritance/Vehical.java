class Vehical {
   private String VehicalType="Train";


    Vehical()
    {

        System.out.println(this.VehicalType);
        System.out.println("Vehical Constructr()");
    }
   
    //to access Private vari from Vehcial Class to train class use Getter()
public String getName()
{
    return this.VehicalType;
}
public static void main(String[] args)
{
    //object creation;
    Vehical obj= new Vehical();

    System.out.println(obj.VehicalType);

}   

}
