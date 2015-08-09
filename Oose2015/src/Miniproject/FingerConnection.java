package Miniproject;

public class FingerConnection {
	
	static boolean pinky; //Used to check if cursor is above fingers
	static boolean ring;
	static boolean middle;
	static boolean index;
	
	static boolean reverbButton; //Used to check if buttons is pressed
	static boolean delayButton;
	static boolean echoButton;
	static boolean chorusButton;
	static boolean resetButton;
	
	public FingerConnection(String finger){ //Prints out information on what is being connected, and takes in the finger as a string
		
		if(reverbButton) //Checks if reverb button was pressed
		{
			System.out.println("A connection between the reverb effect and the "+ finger +" finger has been made"); //Prints out information
			if(finger == "pinky"){GraphicalUserInterface.pinkyConnection = "src/MiniProject/pictures/reverblabel.jpg";} //Changes label above finger
			if(finger == "ring"){GraphicalUserInterface.ringConnection = "src/MiniProject/pictures/reverblabel.jpg";}
			if(finger == "middle"){GraphicalUserInterface.middleConnection = "src/MiniProject/pictures/reverblabel.jpg";}
			if(finger == "index"){GraphicalUserInterface.indexConnection = "src/MiniProject/pictures/reverblabel.jpg";}
		}
		
		if(delayButton)
		{
			System.out.println("A connection between the delay effect and the "+ finger +" finger has been made");
			if(finger == "pinky"){GraphicalUserInterface.pinkyConnection = "src/MiniProject/pictures/delaylabel.jpg";}
			if(finger == "ring"){GraphicalUserInterface.ringConnection = "src/MiniProject/pictures/delaylabel.jpg";}
			if(finger == "middle"){GraphicalUserInterface.middleConnection = "src/MiniProject/pictures/delaylabel.jpg";}
			if(finger == "index"){GraphicalUserInterface.indexConnection = "src/MiniProject/pictures/delaylabel.jpg";}
		}
		
		if(echoButton)
		{
			System.out.println("A connection between the echo effect and the "+ finger +" finger has been made");
			if(finger == "pinky"){GraphicalUserInterface.pinkyConnection = "src/MiniProject/pictures/echolabel.jpg";}
			if(finger == "ring"){GraphicalUserInterface.ringConnection = "src/MiniProject/pictures/echolabel.jpg";}
			if(finger == "middle"){GraphicalUserInterface.middleConnection = "src/MiniProject/pictures/echolabel.jpg";}
			if(finger == "index"){GraphicalUserInterface.indexConnection = "src/MiniProject/pictures/echolabel.jpg";}
		}
		
		if(chorusButton)
		{
			System.out.println("A connection between the cohrus effect and the "+ finger +" finger has been made");
			if(finger == "pinky"){GraphicalUserInterface.pinkyConnection = "src/MiniProject/pictures/choruslabel.jpg";}
			if(finger == "ring"){GraphicalUserInterface.ringConnection = "src/MiniProject/pictures/choruslabel.jpg";}
			if(finger == "middle"){GraphicalUserInterface.middleConnection = "src/MiniProject/pictures/choruslabel.jpg";}
			if(finger == "index"){GraphicalUserInterface.indexConnection = "src/MiniProject/pictures/choruslabel.jpg";}
		}
		
		if(resetButton)
		{
			System.out.println("The reset button was pressed and the connections have been cancelled!");
			GraphicalUserInterface.pinkyConnection = "src/MiniProject/pictures/emptylabel.jpg";
			GraphicalUserInterface.ringConnection = "src/MiniProject/pictures/emptylabel.jpg";
			GraphicalUserInterface.middleConnection = "src/MiniProject/pictures/emptylabel.jpg";
			GraphicalUserInterface.indexConnection = "src/MiniProject/pictures/emptylabel.jpg";
		}
		
		reverbButton = false; //Resets information on which buttons was pressed
		delayButton = false;
		echoButton = false;
		chorusButton = false;
		resetButton = false;
	}
}
