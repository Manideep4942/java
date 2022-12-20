 //thread
class Addone extends Thread{
public void run(){
System.out.println("using thread class");
System.out.println("process executed on thread"+Thread.currentThread().getId());
System.out.println("addone thread is running");
int sum=0;
for(int i=10;i<20;i++)
sum=sum+i;
System.out.println("sum is= "+sum);
}
}
class Addtwo implements Runnable{
public void run(){
System.out.println("using interface");
System.out.println("process executed on thread"+Thread.currentThread().getId());
System.out.println("Add 2nd thread is running");
int sum=0;
for(int i=20;i<=30;i++){
sum=sum+i;
}
System.out.println("sum = "+sum);
}
}
public class ThreadDemo{
public static void main(String[]args){
Addone obj1=new Addone();
Thread obj2 =new Thread(new Addtwo());
obj1.start();
try{
Thread.sleep(500);
}
catch(Exception e){
obj2.start();
}
}
}



