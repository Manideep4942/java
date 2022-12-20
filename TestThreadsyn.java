class sample{
int total=0;
synchronized void m(){
for(int i=1;i<5;i++){
total=total+i;
System.out.println("\t"+ThreadCurrentThread().getId());
try{
Thread.sleep(300);
}catch(Exception e){
System.out.println(e);
}}}}
class Threadsyn extends Thread{
sample s;
Threadsyn(sample s){
this.s=s;
}
public void run(){
s.m();
}}
class Threadsyn1 extends Thread{
sample s;
Threadsyn1(sample s){
this.s=s;
}
public void run(){
s.m();
}}
class TestThreadsyn{
public static void main(String[] args){
sample s=new sample();
System.out.println("Two threads are syncronised");
Threadsyn ts=new Threadsyn(s) ;
Threadsyn1 ts1=new Threadsyn1(s);
ts.start();
ts1.start();
}}