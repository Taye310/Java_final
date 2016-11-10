package Frame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;


public class Traffic extends JPanel  {
	Timer timer;
	Timer timer2;
	JButton play;
	static Color c = null;
	
	public Traffic (){
		setPreferredSize (new Dimension(800, 600));
		
		play = new JButton("PLAY");
		play.addActionListener(new playAc());
		add(play);
		
		timer= new Timer(1000,new playAc());//meimiao zuoshenme 
		timer2=new Timer(5000,new lightAc());//honglvdeng
	}
	private class playAc implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			timer.start();//开始计时
			Car.Move();
			Car.Add();
			repaint();
		}
	}
	private class lightAc implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			timer.start();//开始计时
			changeColor(Color.red);
			repaint();
		}
	}
	static void drawLight(Graphics g){
		g.setColor(c);
		g.fillOval(100, 100, 30, 30);
	}
	private Color changeColor(Color currunt){
		
		if(currunt==Color.red){
			c=Color.green;
		}
		if(currunt==Color.green){
			c=Color.red;
		}
		return c;
	}
//	private class addAc implements ActionListener{
//		public void actionPerformed(ActionEvent e) {
//			Car.Add();
//			//System.out.print(Car.car1num);
//		}
//	}
	

//	public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        Car.Draw(g);
//	}
}


class DrawCar  extends JPanel implements Runnable{
	@Override
	public void run() {
		
		
	}
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Car.Draw(g);
	}
}
class DrawLight  extends JPanel implements Runnable{
	@Override
	public void run() {
		
		
	}
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Traffic.drawLight(g);
	}
}
