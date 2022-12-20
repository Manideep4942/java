public class Deadlock{
public static void main(String[] args){
final String r1="jack sparrow";
final String r2="Barry Flier";
Thread t1=new thread(){
public void run(){
synchronized(r1){
System.out.println("Thread=locked r1");
try{Tread.sleep(100);}catch(Exception e){
synchronised(r2);
System.out.println("Thread1:locked reasource2");
}}}}
Thread t2=new thread(){
public void run(){
synchronized(r2){
System.out.println("Thread=locked r1");
try{Tread.sleep(100);}catch(Exception e){
synchronised(r1);
System.out.println("Thread2:locked reasource1");
}}}}
t1.start();
}}