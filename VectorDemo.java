import java.util.*;
public class VectorDemo{
public static void main(String args[]){
Vector v=new Vector(3,2);
System.out.println("intial size"+v.size());
System.out.println("intial capacity"+v.capacity());
v.addElement(new Integer(1));
v.addElement(new Integer(2));
v.addElement(new Integer(3));
v.addElement(new Integer(4));
System.out.println("capacity after 4 additions"+v.capacity());
v.addElement(new Double(4.65));
v.addElement(new Integer(5));
System.out.println("current capacity "+v.capacity());
v.addElement(new Float(9.45));
v.addElement(new Integer(10));
System.out.println("first element"+(Integer)v.firstElement());
System.out.println("last element"+(Integer)v.lastElement());
if(v.contains(new Integer(3)));
System.out.println("vector contains ");
Enumeration vEnum=v.elements();
System.out.println("Elements in  vector:");
while(vEnum.hasMoreElements())
System.out.println(vEnum.nextElement()+ "");
System.out.println();
}
}