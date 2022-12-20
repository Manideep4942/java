import java.io.*;
class FileClass{
public static void main(String args[])throws Exception {
File f1=new File("E:\\textout.txt");
System.out.println("FileName:"+f1.getName());
System.out.println("path:"+f1.getPath());
System.out.println("Abs Path "+f1.getAbsolutePath());
System.out.println("parent"+f1.getParent());
System.out.println(f1.exists()?"exists":"doesen't exist");
System.out.println(f1.canRead()?"is readable":"isn't readable");
System.out.println(f1.canWrite()?"writable":"isn't writable");
System.out.println(f1.isFile()?"normal file":"might be not safe");
System.out.println(f1.isAbsolute()?"is absolute":"is not absolute");
System.out.println("file last modified"+f1.lastModified());
System.out.println("file size"+f1.length()+"Bytes");
}
}





