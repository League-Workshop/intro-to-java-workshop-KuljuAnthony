package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer =JOptionPane.showInputDialog("What is Bob's first name?");
		 if(answer.equalsIgnoreCase ("bob")) {
	        	speak("correct");
	        	score ++;
	        }else {
	        	speak("wrong");
		// 4.  if the user's answer is correct
	        	String answer2 =JOptionPane.showInputDialog("What is Bob's middle name?");
	   		 if(answer.equalsIgnoreCase ("rottenapl")) {
	   	        	speak("correct");
	   	        	score ++;
	   	        }else {
	   	        	speak("wrong");
	   	        	}
	        }
	        }
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	   	        	


	private static void speak(String string) {
		// TODO Auto-generated method stub
		
	}
}
