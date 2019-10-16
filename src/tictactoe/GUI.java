package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

import tictactoe.ActionListeners.ExitGameAction;
import tictactoe.ActionListeners.StartGameAction;
import tictactoe.ActionListeners.buttonActionListener;

public class GUI {
	
	protected static JFrame currentFrame;
	protected static ArrayList<Integer> boardList; // if 0, not chosen. If 1, X. If 2, O.
	protected static JPanel board;
	protected static Integer turn; // if 0 or even, X turn. O otherwise

	public void beginGUI() {
		currentFrame = createStart();
	}

	public static JFrame createPlay() {
		turn = 0;
		boardList = new ArrayList<>(9);
		
		board = new JPanel();
		board.setLayout(new GridLayout(0, 3));
		
		for(int i = 0; i < 9; i++) {

			JButton temp = new JButton(Integer.toString(i));
			temp.setPreferredSize(new Dimension(25, 25));
			temp.setBackground(Color.WHITE);
			temp.setOpaque(true);
			temp.setForeground(Color.WHITE);
			
//			JLabel tempLabel = new JLabel(Integer.toString(i));
//			//tempLabel.setVisible(false);
//			temp.add(tempLabel);
//			
			temp.addActionListener(new buttonActionListener(temp));
			
			board.add(temp);
			
			boardList.add(0);
		}	
			
		
		JFrame frame = new JFrame("Tic-Tac-Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		frame.add(board);
		
		frame.pack();
		frame.setVisible(true);
		frame.getContentPane();
		
		return frame;
	}
	
	public static JFrame createStart() {
		JFrame frame = new JFrame("Tic-Tac-Toe");
		frame.setLayout(new BorderLayout());
		
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new BorderLayout());
		titlePanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		
		JPanel buttonPanel = new JPanel();
		
		JLabel title = new JLabel("Welcome to Tic-Tac-Toe");
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
	
	
	
	
	public boolean updateBoard(JButton button) {

		if ((button.getText().equals("X")) || (button.getText().equals("O"))){
			errorMessage();
			return false;
		}else {
			String temp = button.getText();
			if ((turn == 0) || (turn%2 == 0)) {
				boardList.set((Integer.parseInt(temp)), 1);
				button.setText("X");
				button.setBackground(Color.RED);
			}else {
				button.setText("O");
				//button.set
				boardList.set((Integer.parseInt(temp)), 2);
				button.setBackground(Color.BLUE);
			}
			turn++;
			System.out.println(boardList);
			backEnd.checkWin();
			return true;
		}
	}

	
	public static JFrame createRedWins() {
		JFrame frame = new JFrame("Tic-Tac-Toe");
		frame.setLayout(new BorderLayout());
		
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new BorderLayout());
		titlePanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		
		JPanel buttonPanel = new JPanel();
		
		JLabel title = new JLabel("RED WINS");
		title.setFont(new Font("Serif", (Font.ITALIC + Font.BOLD), 24));
		title.setHorizontalAlignment(JLabel.CENTER);
		titlePanel.add(title);
		
		JButton startGame = new JButton("Start New Game");
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
	
	public static JFrame createBlueWins() {
		JFrame frame = new JFrame("Tic-Tac-Toe");
		frame.setLayout(new BorderLayout());
		
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new BorderLayout());
		titlePanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		
		JPanel buttonPanel = new JPanel();
		
		JLabel title = new JLabel("BLUE WINS");
		title.setFont(new Font("Serif", (Font.ITALIC + Font.BOLD), 24));
		title.setHorizontalAlignment(JLabel.CENTER);
		titlePanel.add(title);
		
		JButton startGame = new JButton("Start New Game");
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
	
	
	private void errorMessage() {
		System.out.println("Error");
		
	}
	
	
}
