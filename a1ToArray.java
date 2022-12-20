import java.util.*;
class a1ToArray{
public static void main(String args[])
{
ArrayList<Integer> a1=new ArrayList<Integer>();
a1.add(1);
a1.add(2);
a1.add(3);
a1.add(4);
System.out.println("contents"+a1);
Integer ia[]=new Integer[a1.size()];
ia=a1.toArray(ia);
for(int i=0;i<ia.length;i++)
System.out.println(ia[i]);
}
}