package tictactoe.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import tictactoe.GUI;
import tictactoe.backEnd;

public class buttonActionListener extends GUI implements ActionListener {

	private GUI gui;
	private JButton button;
	
//	 Button handler
//	
//	@param gui
//	
//			from GUI class
	
	public buttonActionListener(JButton button1) {
		button = button1;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		updateBoard(button);
		
		
	}

}
