import java.awt.*;
import java.awt.event.*;
public class KeyEventdemo extends Frame implements KeyListener
{
	Label l;
	KeyEventdemo()
	{
		addKeyListener(this);
		l=new Label();
		l.setBounds(20,100,50,20);
		add(l);
		setsize(300,300);
		setLayout(null);
		setvisible(true);
	}
	public void keyTyped (KeyEvent e)
		{
			l.setText("Key Typed");
		}
	public void KeyClicked (KeyEvent e)
		{
			l.setText("Key Clicked");
		}
	public void KeyPressed (KeyEvent e)
		{
			l.setText("Key pressed");
		}
	public static void main(String[] args)
		{
			new KeyEventdemo();
		}
}