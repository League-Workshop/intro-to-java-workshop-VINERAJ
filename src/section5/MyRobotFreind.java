package section5;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyRobotFreind implements KeyListener {
	public static void main(String[] args) {
		new MyRobotFreind().makeFrame();
		//speak("Welcome Friend");
		String answer = JOptionPane.showInputDialog("Press a key!");
		if(answer.equalsIgnoreCase("a")){JOptionPane.showMessageDialog(null,"my name is bob");}
		if(answer.equalsIgnoreCase("b")) {JOptionPane.showMessageDialog(null, "what is your name?");}
		if(answer.equalsIgnoreCase("c")) {JOptionPane.showMessageDialog(null,"cuddle");}
		if(answer.equalsIgnoreCase("d")) {JOptionPane.showMessageDialog(null, "I'm so happy!");}
		System.out.println(answer);
	}

void makeFrame() {
	JFrame frame = new JFrame();
	frame.addKeyListener(this);
	frame.setVisible(true);
}
	

static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	}
	catch (Exception e) {
		 e.printStackTrace();
	 }
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	speak("Welcome Friend");
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}