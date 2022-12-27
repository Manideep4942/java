//dead lock programm
deadlock class Deadlockdemo{
public static void main(String arsg[])
{
final Stiring r1="resource1";
final String r2="resource2";
thread t1=new thread()
{
public void run()
{
synchronised(r1)
{
System.out.println("t1 lacks r1");
Synchoronised(r2)
{
System.out.println("t1 lacks r2");
}
}
}
}
thread t2=new thread()
{
public void run()
{
Synchoronized(r2)
{
System.out.println("t2 lacks r1");
}
}
}
}
t1.start();
t2.start();
}
}

