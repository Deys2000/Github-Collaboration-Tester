import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * This is the main class to run
 */

public class FirstAttempt{

	public static void main(String[] args) {
		// making joke bank object to use later
		JokeBank jokeArray = new JokeBank();

		//setting up the window
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setTitle("Random Joke Generator");
		frame.getContentPane().setLayout(new FlowLayout());
		//setting up the items in the window
		JLabel label = new JLabel("*Joke will show up here*",10);
		JButton button = new JButton("Random Joke");
		frame.getContentPane().add(label);
		frame.getContentPane().add(button);
		frame.setVisible(true);
		
		//setting up the button functionality so that it will generate joke from bank
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String joke;
				joke = jokeArray.jokeList[(int)(Math.random()*jokeArray.jokeList.length)];
				label.setText(joke);
			}        
		});        
	}

}


