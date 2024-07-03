class outer
{
  class inner
  {
     void fun()
     {
        System.out.println("inner fun");
     }

  }

}
class Demo
{
   public static void main(String[] args) {
    outer oref=new outer();
    outer.inner iref=oref.new inner();
    iref.fun();
  // second way
    outer.inner iref2=new outer().new inner();

    new outer().new inner().fun();
   }

}