package Frame;
import java.awt.*;
import java.awt.event.*;
import java.io.Console;
import javax.swing.*;

import java.util.ArrayList;
import java.util.Random;


public class Car {
	public int carx;
	public int cary;
	public int road;
	public int color;
	
	static Random rnd1 = new Random();
	Random rnd2 = new Random();
	
	private static int rgb;
	static Color[] c=new Color[5];
	
	int[] road1=new int[20];
	int[] road2=new int[20];
	int[] road3=new int[20];
	int[] road4=new int[20];
	int[] road5=new int[20];
	
	public static Car[] car1=new Car[20];//first kind of car
	//public ArrayList<Car> car2=new ArrayList<Car>();
	static int car1num=-1;
	
	public Car(){
		carx=300;
		cary=60;
		
	}
	public static void Draw(Graphics g){
		c[0]=Color.RED;
		c[1]=Color.GREEN;
		c[2]=Color.ORANGE;
		c[3]=Color.BLUE;
		c[4]=Color.PINK;
		//set color
		for(int i=0;i<=car1num;i++){
			g.setColor(c[car1[i].color]);
			g.fillRect(car1[i].carx+45*car1[i].road, car1[i].cary, 20, 35);
			//System.out.print(car1[i].cary);
			
		}
	}
	public static void Add(){
		car1num++;
		car1[car1num]=new Car();//important
		car1[car1num].road=rnd1.nextInt(3);
		car1[car1num].color=rnd1.nextInt(5);
	}
	public void Delete(){
		for(int i=0;i<=car1num;i++){
			if(car1[i].cary>=600){
				//delete car
				break;
			}
		}
	}
	public static void Move(){
		for(int i=0;i<=car1num;i++){
			//pengzhuang!!
			car1[i].cary+=40;
			for(int j=i+1;j<=car1num;j++){
				if(car1[i].road==car1[j].road){
					System.out.print("1");
					if(car1[j].cary>=car1[i].cary-35){
						System.out.print("2");
						car1[j].cary-=40;
					}
				}
			}
		}
	}
}
