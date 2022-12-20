import java.util.*;
class ArrayListDemo{
public static void main(String[] args){
ArrayList<String> a1=new ArrayList<String>();
System.out.println("Intial size of a1:"+a1.size());
a1.add("a");
a1.add("b");
a1.add("c");
a1.add("d");
a1.add("e");
a1.add("a2");
System.out.println("size after addition "+a1.size());
System.out.println("contents of al "+a1);
a1.remove("a2");
System.out.println("size after deletion"+a1.size());
System.out.println("contents of a1"+a1);
}}