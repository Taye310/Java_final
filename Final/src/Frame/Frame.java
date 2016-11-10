package Frame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame {
	public static void main(String[] args){
		JFrame frame=new JFrame("Traffic Management");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Traffic());
		
		DrawCar dc = new DrawCar();
        DrawLight dl = new DrawLight();
        Thread t1 = new Thread(dc);
        Thread t2 = new Thread(dl);
        t1.start();
        t2.start();

		frame.pack();
		frame.setVisible(true);
	}
}
