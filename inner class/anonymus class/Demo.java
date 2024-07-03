class emp
{
  void calsal()
  {
    System.out.println("emp sal");
  }
}
class Demo
{
   public static void main(String[] args) {
    emp shivtej=new emp()
    {
        void calsal()
        {
            System.out.println("shivtej salary");
        }
    };
    shivtej.calsal();
   }
}
