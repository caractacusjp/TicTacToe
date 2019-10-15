package checkers.ActionListeners;

import java.awt.event.ActionEvent;
import checkers.GUI;
import java.awt.event.ActionListener;

public class ExitGameAction extends GUI implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		currentFrame.dispose();
		
	}

}
