class Shape {
    //property
      int n=4;
      static int m=1;


      //behaviour
      public void TotalShape()
    {
        System.out.println("Total no of shapes are:"+this.n);
    }

    static void CurrentShapeNo()
    {
         System.out.println("Triangle is shapes No :"+Shape.m);
    }
}
