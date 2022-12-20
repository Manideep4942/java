import java.util.*;
class userinputdemo
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
    int a=sc.nextInt();
    System.out.println("enter second number");
    float b=sc.nextFloat();
    System.out.println("enter third number");
    int c=sc.nextInt();
    float d=a+b+c;
    System.out.println("total="+d);
  }
}