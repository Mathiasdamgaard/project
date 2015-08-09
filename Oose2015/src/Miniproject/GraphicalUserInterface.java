package Miniproject;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class GraphicalUserInterface extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	BufferedImage imageGlove; //creates image variables
	BufferedImage reverbButton;
	BufferedImage delayButton;
	BufferedImage echoButton;
	BufferedImage chorusButton;
	BufferedImage resetButton;
	BufferedImage imageArrow;
	BufferedImage pinky;
	BufferedImage ring;
	BufferedImage middle;
	BufferedImage index;
	BufferedImage pinkyConnected;
	BufferedImage ringConnected;
	BufferedImage middleConnected;
	BufferedImage indexConnected;
	BufferedImage emptyConnected;

	public GraphicalUserInterface(String reverb, String delay, String echo, String chorus, String reset)  //Delivers picture path from pictureBlocks
	{
		GraphicalUserInterface.reverb = reverb;
		GraphicalUserInterface.delay = delay;
		GraphicalUserInterface.echo = echo;
		GraphicalUserInterface.chorus = chorus;
		GraphicalUserInterface.reset = reset;
	}

	public Dimension getPreferredSize() //Sets dimensions of the window
	{return new Dimension(1000,600);}
	
	static String reverb, delay, echo, chorus, reset;
	static String pinkyConnection = "src/MiniProject/pictures/emptylabel.jpg", 
			ringConnection = "src/MiniProject/pictures/emptylabel.jpg", 
			middleConnection = "src/MiniProject/pictures/emptylabel.jpg", 
			indexConnection = "src/MiniProject/pictures/emptylabel.jpg";
	
	public void paintComponent(Graphics g){ //Class used to paint the interface
		super.paintComponent(g);

		try 
		{
			imageGlove = ImageIO.read(new File("src/MiniProject/pictures/imageGlove.jpg")); //Loads in images
			imageArrow = ImageIO.read(new File("src/MiniProject/pictures/arrowImage.jpg"));
			pinky = ImageIO.read(new File("src/MiniProject/pictures/pinky.gif"));
			ring = ImageIO.read(new File("src/MiniProject/pictures/ring.gif"));
			middle = ImageIO.read(new File("src/MiniProject/pictures/middle.gif"));
			index = ImageIO.read(new File("src/MiniProject/pictures/index.gif"));
			reverbButton = ImageIO.read(new File(reverb));
			delayButton = ImageIO.read(new File(delay));
			echoButton = ImageIO.read(new File(echo));
			chorusButton = ImageIO.read(new File(chorus));
			resetButton = ImageIO.read(new File(reset));
			pinkyConnected = ImageIO.read(new File(pinkyConnection));
			ringConnected = ImageIO.read(new File(ringConnection));
			middleConnected = ImageIO.read(new File(middleConnection));
			indexConnected = ImageIO.read(new File(indexConnection));
		} catch (IOException e) 
		{e.printStackTrace();}

		//Drawing Text for interface
		g.drawString("Select an effect from below", 150, 25);
		g.drawString("Drag onto preferred finger", 650 ,25);
		
		//Importing picture for interface
		g.drawImage(reverbButton, 50, 50, this);
		g.drawImage(delayButton, 275, 50, this);
		g.drawImage(echoButton, 50, 275, this);
		g.drawImage(chorusButton, 275, 275, this);
		g.drawImage(resetButton, 90, 500, this);
		g.drawImage(imageArrow, 365, -2, this);
		g.drawImage(imageGlove, 550, 50, this);
		
		//Fingertips highlighting
		if(FingerConnection.pinky)
		{g.drawImage(pinky, 585, 135, this);}
		if(FingerConnection.ring)
		{g.drawImage(ring, 650, 75, this);}
		if(FingerConnection.middle)
		{g.drawImage(middle, 720, 60, this);}
		if(FingerConnection.index)
		{g.drawImage(index, 774, 81, this);}
		
		//Info above fingertips
		g.drawImage(pinkyConnected, 565, 115, this);
		g.drawImage(ringConnected, 638, 55, this);
		g.drawImage(middleConnected, 720, 40, this);
		g.drawImage(indexConnected, 780, 61, this);
		
		repaint();
	}
}
