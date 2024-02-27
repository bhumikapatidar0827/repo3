 import java.awt.Frame;
 import java.awt.Graphics;
 import java.awt.Color;
 class FDemo extends Frame{
	 FDemo()
	 {}
		 
 public void paint(Graphics g){
	 g.drawString("INTRODUCTION",50,60);
	 g.drawLine(50,60,200,60);
	  g.drawLine(50,65,200,65);
	 g.drawRect(100,100,600,300);
	 g.drawRect(110,110,580,280);
	 g.drawString("My Name is Bhumika Patidar.I am basically from Dhamnod.",200,150);
	 g.drawString("I did my schooling from Adarsh Academy Dhamnod.",200,170);
	 g.drawString("Currently I am pursuing B.Tech CS in AITR ,Indore",200,190);
	 g.drawString("My Strength are I am Self Motivated ,hardworking person",200,210);
	 g.drawString("My short term goal is to get a job in reputed company",200,230);
	 g.drawString("And my long term goal is to become a succesful software engineer",200,250);
	 g.drawString("My hobbies are listening to music ,dancing and watching movies",200,270);
	 g.drawString("That's all about me thank you.",200,290);
	 
	
	 
	// g.drawLine(100,100,300,100);
	// g.drawRect(100,100,300,300);
	// g.drawRoundRect(400,100,200,200,100,100);
	// g.drawOval(100,100,200,300);
	// g.drawArc(100,100,100,100,90,270);
	 
 }
 }
 
 class Demo124{
	 public static void main(String ar[]){
		 FDemo f = new FDemo();
		 f.setVisible(true);
		 //f.setSize(w,h);
		 f.setSize(1000,1500);
		 f.setLocation(300,200);
		 f.setBackground(Color.cyan);
		 f.setForeground(Color.black);
		
	 }
 }
 	 
 