interface InterDemo
{
void display();
void run();
}
class ImpleInterDemo implements InterDemo
{
public void display()
{
System.out.println("we are using interface");
}
public void run()
{
System.out.println("executing run method");
}
}
public class TestInterdemo
{
public static void main(String[] args)
{
ImpleInterDemo tid=new ImpleInterDemo();
tid.display();
tid.run();
}
}