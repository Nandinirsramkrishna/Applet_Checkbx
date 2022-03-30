package checkbox;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
 public class Applet3 extends Applet

 {
	 GridLayout g1;
	 Checkbox c1,c2,c3,c4;
	 TextField t1;
	 Label l1,l2,l3,l4;
	 public void init()
	 {
		 g1=new GridLayout(5,1);
		 setLayout(g1);
		 add(c1=new Checkbox("1"));
		 add(c2=new Checkbox("2"));
		 add(c3=new Checkbox("3"));
		 add(c4=new Checkbox("4"));
		 add(t1=new TextField(10));	 
		 
	 }
 
 public boolean action(Event e,Object o)
 {
	 int sum=0;
	 if(c1.getState()==true)
		 sum=sum+1;
	 if(c2.getState())
		 sum=sum+2;
	 if(c3.getState())
		 sum=sum+2;
	 if(c4.getState())
		 sum=sum+3;
	 
	 
	 t1.setText(String.valueOf(sum)); 
	 return true;
 }
 }
