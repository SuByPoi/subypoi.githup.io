package Bai2;
import java.math.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.math.*;
public class TamGiac extends JFrame implements ActionListener {
	Label l1,l2,l3,l4,l5;
	TextField ta,tb,tc,tkq;
	Button dientich,chuvi,reset,exit;
	Panel pn,p1,p2,p3,p4,p5;
	public void get()
	{
		l1 = new Label("Dien Tich-Chu Vi");
		l2 = new Label("Do dai canh a");
		l3 = new Label("Do dai canh b");
		l4 = new Label("Do dai canh c");
		l5 = new Label("Ket qua");
		
		ta = new TextField();
		tb = new TextField();
		tc = new TextField();
		tkq = new TextField();
		tkq.enable(false);
		
		dientich = new Button("Dien Tich");
		dientich.setBackground(Color.RED);
		chuvi = new Button("Chu Vi");
		chuvi.setBackground(Color.RED);
		reset = new Button("Reset");
		reset.setBackground(Color.RED);
		exit = new Button("Exit");
		exit.setBackground(Color.RED);
		
		dientich.addActionListener(this);
		chuvi.addActionListener(this);
		reset.addActionListener(this);
		exit.addActionListener(this);
		
		pn = new Panel(new GridLayout(3,1));
		p1 = new Panel(new FlowLayout());
		p2 = new Panel(new GridLayout(3,2,10,10));
		p3 = new Panel(new GridLayout(3,2,10,10));
		p1.add(l1);
		p2.add(l2);
		p2.add(ta);
		p2.add(l3);
		p2.add(tb);
		p2.add(l4);
		p2.add(tc);
		p3.add(dientich);
		p3.add(chuvi);
		p3.add(l5);
		p3.add(tkq);
		p3.add(reset);
		p3.add(exit);
		pn.add(p1);
		pn.add(p2);
		pn.add(p3);
		add(pn);
		setSize(300,300);
		show();
	}
	public TamGiac(String s)
	{
		super(s);
		get();
	}

	public void actionPerformed(ActionEvent e)
	{
		try
		{
		double a = Double.parseDouble(ta.getText());
		double b = Double.parseDouble(tb.getText());
		double c = Double.parseDouble(tc.getText());
		double cv = 0;
		if(e.getSource() == dientich)
		{
			if( (a >= b+c) || (b >= c+a) || (c >= a+b) )
			{
				tkq.setText("khong phai do dai 3 canh cua tam giac");
			}
			else 
			{
				 cv = (a+b+c)/2;
				 double dt = Math.sqrt(cv*(cv-a)*(cv-b)*(cv-c));
				 tkq.setText(Double.toString(dt));
			}
		}
		

		}
		catch(Exception t)
		{
			
		}
		try
		{
			double a = Double.parseDouble(ta.getText());
			double b = Double.parseDouble(tb.getText());
			double c = Double.parseDouble(tc.getText());
			double cv = 0;
			if(e.getSource() == chuvi)
			{
				if( (a >= b+c) || (b >= c+a) || (c >= a+b) )
				{
					tkq.setText("khong phai do dai 3 canh cua tam giac");
				}
				else
				{
					cv = (a+b+c);
					tkq.setText(Double.toString(cv));
				}
			}
		}
		catch(Exception t)
		{
			
		}
		
		if(e.getSource() == reset)
		{
				ta.setText("");
				tb.setText("");
				tc.setText("");
				tkq.setText("");
		}
		
		if(e.getSource() == exit)
		{
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                new TamGiac("Chu vi va dien tich tam giac");
	}

}

