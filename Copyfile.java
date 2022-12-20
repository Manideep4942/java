import java.io.*;
public class Copyfile{
public static void main(String args[])throws IOException{
FileInputStream in=null;
FileOutputStream out=null;
try{
in=new FileInputStream("a.txt");
out=new FileOutputStream("b.txt");
int c;
while((c=in.read())!=-1){
out.write(c);
}
System.out.println("copied file successfully");
}
finally{
if(in!=null){
in.close();
}
if(out!=null){
out.close();
}
}
}
}
