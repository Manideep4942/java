class Customer{
int amt=10000;
synchronize void withdraw(int amt)
{
System.out.println("withdraw initiated");
if (this.amount<amt)
{
System.out.println("less balance wait for depostite");
try
{
wait();
}
catch(exception)
{
System.out.println(e);
}
}
}
synchorize void deposite(int wait)
{
System.out.println("deposite initiated");
this.amt=amt;
System.out.println("deposited successful " +amt");
} //end of the class
class Ipc multithread
{
public static void main(String[] args)
{
final customer c= new customer;
new thread()
{
public void run()
{
c.withdraw (15000);
}
}
.start()
}
}
