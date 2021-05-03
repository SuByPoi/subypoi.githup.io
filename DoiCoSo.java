package Bai1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.math.*;
public class DoiCoSo extends JFrame implements ActionListener {
	Label l1,l2,l3,l4,l0;
	TextField tx1,tx2,tx3,tx4;
	Button ok,reset,exit;
	Panel pn,p1,p2,p3;
	//Frame frame = new Frame();
	public void get()
	{
		l0 = new Label("DOI CO SO ");
		l1 = new Label("Nhap so nguyen duong ");
		l2 = new Label("He nhi phan ");
		l3 = new Label("He bat phan ");
		l4 = new Label("He thap luc phan ");
		
		tx1 = new TextField();
		tx2 = new TextField();
		tx3 = new TextField();
		tx4 = new TextField();
		
		ok = new Button("OK");
		reset = new Button("RESET");
		exit = new Button("EXIT");
		ok.addActionListener(this);
		reset.addActionListener(this);
		exit.addActionListener(this);
		
		pn = new Panel(new GridLayout(3,1));
		p1 = new Panel(new FlowLayout());
		p2 = new Panel(new GridLayout(4,2));
		p3 = new Panel(new FlowLayout());
		
		p1.add(l0);
		p2.add(l1);
		p2.add(tx1);
		p2.add(l2);
		p2.add(tx2);
		p2.add(l3);
		p2.add(tx3);
		p2.add(l4);
		p2.add(tx4);
		p3.add(ok);
		p3.add(reset);
		p3.add(exit);
		pn.add(p1);
		pn.add(p2);
		pn.add(p3);
        add(pn);
		setSize(400,300);
		show();
	}
	public DoiCoSo(String s)
	{
		super(s);
		get();
	}
	public void actionPerformed(ActionEvent e)
	{
             try
             {
            	 if(e.getSource() == ok)
     			{
     				int n = Integer.parseInt(tx1.getText());
     				int r=0;
     				String s = "";
     				String k ="";
     				while(n > 0)
     				{
     					r = n%2;
     					n = n/2;
     					s = s + Integer.toString(r);
     				}
     				for(int i = s.length()-1 ; i>=0;i--)
     				{
     					k = k + s.charAt(i);
     				}
     				tx2.setText(k);
     				
     				int n1 = Integer.parseInt(tx1.getText());
     				String u ="",m="";
     				while(n1 > 0)
     				{
     					r = n1 % 8;
     					n1 = n1/8;
     					u = u+Integer.toString(r);
     				}
     				for(int i = u.length()-1 ; i>=0;i--)
     				{
     					m = m + u.charAt(i);
     				}
     				tx3.setText(m);
     				
     				int n2 = Integer.parseInt(tx1.getText());
     				String b = "";
     				String v = "";
     				String t = "";
     				while(n2 > 0)
     				{
     					r = n2 % 16;
     					b = Integer.toString(r);
     					n2 = n2/16;
     					if(r == 10)
     					{
     						b = "A";
     					}
     					if(r == 11)
     					{
     						b = "B";
     					}
     					if(r == 12)
     					{
     						b = "C";
     					}
     					if(r == 13)
     					{
     						b = "D";
     					}
     					if(r == 14)
     					{
     						b = "E";
     					}
     					if(r == 15)
     					{
     						b = "F";
     					}
     					v += b;
     				}
     				for(int i = v.length()-1 ; i>=0;i--)
     				{
     					t = t + v.charAt(i);
     				}
     				tx4.setText(t);	
     				}
             }
             catch(Exception t)
             {
            	 
             }
			

			if(e.getSource() == reset)
			{
				tx1.setText("");
				tx2.setText("");
				tx3.setText("");
				tx4.setText("");
			}
			
			if(e.getSource() == exit)
			{
				System.exit(0);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                     new DoiCoSo("Doi Co So");
	}

}
