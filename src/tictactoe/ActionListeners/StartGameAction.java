package tictactoe.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import tictactoe.GUI;

public class StartGameAction extends GUI implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		currentFrame.dispose();
		currentFrame = GUI.createPlay();
	}

}
