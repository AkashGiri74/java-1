class outer
{
   void fun()
   {
    int b=20;
      class inner
      {
        void gun()
        {
          System.out.println("inner gun");
          //System.out.println(b);//error
        }
      }
      b++;
      System.out.println(b);
     
      inner iref=new inner();
      iref.gun();

   }
   public static void main(String[] args)
    {
        outer oref=new outer();
        oref.fun();
    }


}
