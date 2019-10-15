package checkers;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

import checkers.ActionListeners.ExitGameAction;
import checkers.ActionListeners.StartGameAction;

public class GUI {
	
	protected static JFrame currentFrame;

	public void beginGUI() {
		currentFrame = createStart();
	}

	public static JFrame createPlay() {
		JFrame frame = new JFrame("Cactus Checkers");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane();
		
		JMenuBar menuBar = new JMenuBar(); // creates menu bar
		
		JMenu file = new JMenu("File"); // creates menu item
		JMenu edit = new JMenu("Edit");
		JMenu help = new JMenu("Help");
		
		JMenuItem newGame = new JMenu("New Game");
		
		//insert action listener
		
		file.add(newGame);
		
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);
		
		frame.setJMenuBar(menuBar);
		
		frame.pack();
		
		return frame;
	}
	
	public static JFrame createStart() {
		JFrame frame = new JFrame("Cactus Checkers");
		frame.setLayout(new BorderLayout());
		
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new BorderLayout());
		titlePanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		
		JPanel buttonPanel = new JPanel();
		
		JLabel title = new JLabel("Welcome to Cactus Checkers");
		title.setFont(new Font("Serif", (Font.ITALIC + Font.BOLD), 24));
		title.setHorizontalAlignment(JLabel.CENTER);
		titlePanel.add(title);
		
		JButton startGame = new JButton("Start Game");
		startGame.addActionListener(new StartGameAction());
		
		JButton exitGame = new JButton("Exit Game");
		exitGame.addActionListener(new ExitGameAction());		
		
		
		buttonPanel.setLayout(new GridLayout(1,2));
		buttonPanel.add(startGame);
		buttonPanel.add(exitGame);
		
		frame.add(buttonPanel, BorderLayout.SOUTH);
		frame.add(titlePanel, BorderLayout.NORTH);
		
		frame.setSize(400,100);  // Don't use .pack() - sizes to items inside jframe			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		return frame;
			
	}
	
	
	
}
