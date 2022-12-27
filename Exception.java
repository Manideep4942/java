class Exception{
public static  void main(String[] args)
{ 
try()
{
int a=1/10;
System.out.println("a");
}
catch (Exception e)
{
System.out.println("e");
}
finally("This block execute always");
}
}