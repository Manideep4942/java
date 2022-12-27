import java.io.*;
public class Copyfiledemo{
public static void main(String[] args)throws IoException
	{
		FileInputstream in=null;
		FileOutputstream out=null;
	}
	try
	{
		in=newFileInputstream("input.txt");
		out=newFileOutoutstream("output.txt");
		int c;
		while((c=in.read)!=-1)
			{
				out.write(e);
			}
	}
		catch(Exception e)
			{
				System.out.println(e);
			}
			
}