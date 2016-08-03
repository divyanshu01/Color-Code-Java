import java.awt.*;
import java.awt.event.*;
class ColorSetter extends Frame implements AdjustmentListener,WindowListener
{
  TextField t1,t2,t3,t4,t5,t6,t7;
  Scrollbar s1,s2,s3;
  Panel p1,p2,p3,p4;
  ColorSetter()
  {
    t1=new TextField("  Red");
    t2=new TextField("  Green");
    t3=new TextField("  Blue");
    t4=new TextField();
    t5=new TextField("0");
    t6=new TextField("0");
    t7=new TextField("0");
    t4.setBackground(new Color(0,0,0));
    s1=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,256);
    s2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,256);
    s3=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,256);
    s1.addAdjustmentListener(this);
    s2.addAdjustmentListener(this);
    s3.addAdjustmentListener(this);
    p1=new Panel();
    p1.setLayout(new GridLayout(6,1));
    p2=new Panel();
    p2.setLayout(new GridLayout(1,2));
    p3=new Panel();
    p3.setLayout(new GridLayout(1,2));
    p4=new Panel();
    p4.setLayout(new GridLayout(1,2));
    p2.add(t1);p2.add(t5);
    p3.add(t2);p3.add(t6);
    p4.add(t3);p4.add(t7);
    p1.add(s1);p1.add(p2);
    p1.add(s2);p1.add(p3);
    p1.add(s3);p1.add(p4);
    add(p1,BorderLayout.SOUTH);
    add(t4,BorderLayout.CENTER);
    setBounds(400,100,400,400);
    setResizable(false);
    setVisible(true);
  }
  public static void main(String [] args)
  {
    new ColorSetter();
  }
  public void adjustmentValueChanged(AdjustmentEvent ae)
  {
    t5.setText(s1.getValue()+"");
    t6.setText(s2.getValue()+"");
    t7.setText(s3.getValue()+"");
    int r=Integer.parseInt(t5.getText());
    int g=Integer.parseInt(t6.getText());
    int b=Integer.parseInt(t7.getText());
    t4.setBackground(new Color(r,g,b));
  }
  public void windowClosing(WindowEvent we)
  {
    Frame a=(Frame)we.getWindow();
    a.dispose();
  }
  public void windowClosed(WindowEvent we){}
  public void windowOpened(WindowEvent we){}
  public void windowIconified(WindowEvent we){}
  public void windowDeiconified(WindowEvent we){}
  public void windowActivated(WindowEvent we){}
  public void windowDeactivated(WindowEvent we){}
}
