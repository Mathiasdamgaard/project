package Miniproject;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class InterfaceBuillder{

	public static void main(String[] args){

		final JFrame frame = new JFrame("Interface");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
		frame.add(new GraphicalUserInterface(
				"src/MiniProject/pictures/reverbButton.jpg", 
				"src/MiniProject/pictures/delayButton.jpg", 
				"src/MiniProject/pictures/echoButton.jpg", 
				"src/MiniProject/pictures/chorusButton.jpg", 
				"src/MiniProject/pictures/resetButton.jpg"));
		frame.setLocationRelativeTo(null);
		frame.pack();
		
		frame.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseReleased(MouseEvent e){
				if(FingerConnection.reverbButton) //Sets reverb button to original start picture if it has been pressed
				{GraphicalUserInterface.reverb = "src/MiniProject/pictures/reverbButton.jpg";}
				if(FingerConnection.delayButton)
				{GraphicalUserInterface.delay = "src/MiniProject/pictures/delayButton.jpg";}
				if(FingerConnection.echoButton)
				{GraphicalUserInterface.echo = "src/MiniProject/pictures/echoButton.jpg";}
				if(FingerConnection.chorusButton)
				{GraphicalUserInterface.chorus = "src/MiniProject/pictures/chorusButton.jpg";}
				if(FingerConnection.resetButton)
				{GraphicalUserInterface.reset = "src/MiniProject/pictures/resetButton.jpg";}
				
				int x = e.getX();
				int y = e.getY();
				
				if(x > 585 && y > 135 && x < 653 && y < 270){ //Released over pinky finger
					System.out.println("Released over pinky finger"); //Information to console
					new FingerConnection("pinky");	//Part 2 of connection information for console
				} else if(x > 654 && y > 75 && x < 710 && y < 215 ){ //Released over ring finger
					System.out.println("Released over ring finger");
					new FingerConnection("ring");
				} else if(x > 720 && y > 65 && x < 780 && y < 200){ //Released over middle finger
					System.out.println("Released over middle finger");
					new FingerConnection("middle");
				} else if(x > 785 && y > 85 && x < 835 && y < 225){ //Released over index finger
					System.out.println("Released over index finger");
					new FingerConnection("index");
				} else {
					System.out.println("Mouse was not above any fingers when released!");
					new FingerConnection("none");
				}	
			}
			
			@Override
			public void mousePressed(MouseEvent e){
								
				int x = e.getX();
				int y = e.getY() - 22;
				
				System.out.println("Cordinates is: (" + x + "," + y +")"); //Information to console
				
				if(x > 50 && y > 50 && x < 225 && y < 225){ //Reverb button threshold
					System.out.println("Reverb button pressed!"); //Information to console
					GraphicalUserInterface.reverb = "src/MiniProject/pictures/reverbButtonPressed.jpg"; //Changes the reverb button to look pressed
					FingerConnection.reverbButton = true; //Part 1 of connection information for console
				} else if(x > 275 && y > 50 && x < 450 && y < 225){ //Delay button threshold
					System.out.println("Delay button pressed!");
					GraphicalUserInterface.delay = "src/MiniProject/pictures/delayButtonPressed.jpg";
					FingerConnection.delayButton = true;
				} else if(x > 50 && y > 275 && x < 225 && y < 450){ //Echo button threshold
					System.out.println("Echo button pressed!");
					GraphicalUserInterface.echo = "src/MiniProject/pictures/echoButtonPressed.jpg";
					FingerConnection.echoButton = true;
				} else if(x > 275 && y > 275 && x < 450 && y < 450){ //Chorus button threshold
					System.out.println("Chorus button pressed!");
					GraphicalUserInterface.chorus = "src/MiniProject/pictures/chorusButtonPressed.jpg";
					FingerConnection.chorusButton = true;
				} else if(x > 90 && y > 500 && x < 410 && y < 550){ //Reset button threshold
					System.out.println("Reset button pressed!");
					GraphicalUserInterface.reset = "src/MiniProject/pictures/resetButtonPressed.jpg";
					FingerConnection.resetButton = true;
				}
			}
		});
		
		frame.addMouseMotionListener(new MouseAdapter(){
			public void mouseMoved(MouseEvent e){
				
				int x = e.getX();
				int y = e.getY();
				
				if (x > 585 && y > 135 && x < 653 && y < 270){ //Moved over pinky finger and inverts finger
					FingerConnection.pinky = true;
					FingerConnection.ring = false;
					FingerConnection.middle = false;
					FingerConnection.index = false;
				} else if (x > 654 && y > 75 && x < 710 && y < 215 ){ //Moved over ring finger
					FingerConnection.ring = true;
					FingerConnection.pinky = false;
					FingerConnection.middle = false;
					FingerConnection.index = false;
				} else if (x > 720 && y > 65 && x < 780 && y < 200){ //Moved over middle finger
					FingerConnection.middle = true;
					FingerConnection.pinky = false;
					FingerConnection.ring = false;
					FingerConnection.index = false;
				} else if (x > 785 && y > 85 && x < 835 && y < 225){ //Moved over index finger
					FingerConnection.index = true;
					FingerConnection.pinky = false;
					FingerConnection.ring = false;
					FingerConnection.middle = false;
				} else { //Moved over no fingers
					FingerConnection.pinky = false;
					FingerConnection.ring = false;
					FingerConnection.middle = false;
					FingerConnection.index = false;
				}
			}
			
			public void mouseDragged(MouseEvent e){
				
				int x = e.getX();
				int y = e.getY();
				
				if (x > 585 && y > 135 && x < 653 && y < 270){ //Dragged over pinky finger and inverts finger
					FingerConnection.pinky = true;
					FingerConnection.ring = false;
					FingerConnection.middle = false;
					FingerConnection.index = false;
				} else if (x > 654 && y > 75 && x < 710 && y < 215 ){ //Dragged over ring finger
					FingerConnection.ring = true;
					FingerConnection.pinky = false;
					FingerConnection.middle = false;
					FingerConnection.index = false;
				} else if (x > 720 && y > 65 && x < 780 && y < 200){ //Dragged over middle finger
					FingerConnection.middle = true;
					FingerConnection.pinky = false;
					FingerConnection.ring = false;
					FingerConnection.index = false;
				} else if (x > 785 && y > 85 && x < 835 && y < 225){ //Dragged over index finger
					FingerConnection.index = true;
					FingerConnection.pinky = false;
					FingerConnection.ring = false;
					FingerConnection.middle = false;
				} else { //Dragged over no fingers
					FingerConnection.pinky = false;
					FingerConnection.ring = false;
					FingerConnection.middle = false;
					FingerConnection.index = false;
				}
			}
		});
		frame.setVisible(true);		
	}
}