abstract class figure
{
double area;
double len,breadth;
figure(double a,double b)
{
len=a;
breadth=b;
}
abstract double area();
}
class Rectangle extends figure
{
Rectangle(double a,double b)
{
super(a,b);
}
double area()
{
return(len*breadth);
}
}
class triangle extends figure
{
triangle(double a,double b)
{
super(a,b);
}
double area()
{
return (len*breadth)/2;
}
}
public class Abstractdemo
{
public static void main(String[] args)
{
Rectangle r= new Rectangle(600,300);
System.out.println("Area of rectangle= "+r.area());
triangle t= new triangle(900,500);
System.out.println("area of triangle= "+t.area());
}
}