import java.util.*;
class HashTableDemo{
public static void main(String args[]){
Hashtable<Integer,String> student=new Hashtable<Integer,String>();
student.put(new Integer(101),"Emma");
student.put(new Integer(102),"Adella");
student.put(new Integer(103),"Area");
student.put(new Integer(104),"Ally");
Set dataset=student.entrySet();
Iterator it=dataset.Iterator();
while(it.hasNext()){
Map Entrymap=(Map.Entry)Iterate.next();
System.out.println(Map.getkey()+""+Map.getvalue());
}
}
}