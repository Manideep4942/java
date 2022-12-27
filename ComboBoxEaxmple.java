import java.swing.*;
public class ComboBoxExample{
JFrame f;
ComboBoxExample(){
f=new JFrame("ComboBoxExample");
string country[]={"india","usa","africa","austrila","srilanka"};
jComboBox cb=new JComboBox(country);
cb.setBunds(50,50,90,20);
f.add(cb);
f.setlayout(null);
f.setsize(400,500);
f.setvisible(true);
}
public static void main(String[] args)
{
new ComboBoxExample();
}
}