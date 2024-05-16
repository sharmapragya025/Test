
class Super
{
    public void display()
    {
        System.out.println("Super class Display");
    }
}
class sub extends Super
{
    @Override
    public void display()
    {
        System.out.println("Sub class display");
    }
}
public class overriding
{
    public static void main(String [] args)
    {
     
      Super sup=new sub();
      sup.display();
    }

}