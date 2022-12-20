import java.util.*;
class StackExample{
public static void main(String args[]){
Stack st=new Stack();
st.push("Emma");
st.push("Adele");
st.push("Aria");
st.push("Ally");
Enumeration enum1=st.elements();
while(enum1.hasMoreElements())
System.out.println(enum1.nextElement()+"");
st.pop();
st.pop();
st.pop();
System.out.println("After deleting 3 elements from stack  ");
Enumeration enum2=st.elements();
while(enum2.hasMoreElements())
System.out.println(enum2.nextElement()+"");
}
}
