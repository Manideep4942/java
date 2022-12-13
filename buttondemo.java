import java.awt.*;
import java.applet.*;
/*
<applet code="Buttondemo.class" width="200" height="200">
</applet>
*/
public class Buttondemo extends Applet
	{
		public void init()
				{
					Button B1=new Button();
					B1.setLabel("Button one");
					Button B2=new Button ("Button two");
					add(B1);
					add(B2); //this for output
				}
	}