/* <html>
<body>
<applet code="GraphicsDemo.class" width="300" height="300">
</applet>
</body>
</html> */

import java.applet.Applet;
import java.awt.*;
public class GraphicsDemo extends Applet{
public void init(){ }
public void paint(Graphics g){
g.setColor(Color.red);
g.drawString("welcome",50,50);
g.drawRect(70,100,50,30);
g.fillRect(170,1100,30,30);
g.drawOval(70,100,30,30);
g.setColor(Color.pink);
g.fillOval(170,200,30,30);
g.drawArc(90,1502,30,30,30,180);
}
}