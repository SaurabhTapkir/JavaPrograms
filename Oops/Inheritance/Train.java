class Train extends Vehical {

    int Speed;
    int length;

Train()
{
   Speed=10;
   System.out.println(Speed);
     
}

public static void main(String[] args)
{
    Train obj=new Train();
    System.out.println(obj.getName());

System.out.println(obj.Speed);
//int speed=obj.detail(100);
//System.out.println(speed);


}
}
