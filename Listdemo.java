import java.awt.*;
import java.applet.*;
/*
<applet code="Listdemo.class" width="800" height="800">
</applet>
*/
public class Listdemo extends Applet
	{
		public void init()
			{
				List Ll=new List(3);
				Ll.add("java");
				Ll.add("php");
				Ll.add("c");
				add(Ll); 
			}
	}