public class AgeCheck
{
static void CheckAge(int age)
{
try
{
if(age<18)
{
throw new exception
("ooops!you are not eligible to votes");
}
else
{
System.out.println("you are eligible");
}
catch(exception e)
{
System.out.println(e);
}
}
public static void main(String[] args)
{
int age= Integer.parseInt(arg[0]);
CheckAge(age);
}
}