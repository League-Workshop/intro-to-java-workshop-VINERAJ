package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	for(int i=0;i<1234;i++) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int random = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(random);
	// 4. Get the user to enter something that they think is awesome
speak("What do you think is awesome?");
JOptionPane.showInputDialog("What do you think is awesome?");
	// 5. If the random number is 0
if(random==0) {speak("awesome");JOptionPane.showMessageDialog(null, "Awesome!");}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
else if(random==1) {speak("that's ok");JOptionPane.showMessageDialog(null, "OK");}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
else if(random==2) {speak("Boring");JOptionPane.showMessageDialog(null, "BORING!!!!");}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
else if(random==3) {speak("watch out");}
	// -- write your own answer
	}
}


	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}
}



