package tictactoe;

public class backEnd extends GUI{

	
	public static void checkWin() {
			if((boardList.get(0) == 1) && (boardList.get(1) == 1) && (boardList.get(2) == 1)){
				redWins();
			}else if ((boardList.get(3) == 1) && (boardList.get(4) == 1) && (boardList.get(5) == 1)) {
				redWins();
			}else if ((boardList.get(6) == 1) && (boardList.get(7) == 1) && (boardList.get(8) == 1)) {
				redWins();
			}else if ((boardList.get(0) == 1) && (boardList.get(3) == 1) && (boardList.get(6) == 1)) {
				redWins();
			}else if ((boardList.get(1) == 1) && (boardList.get(4) == 1) && (boardList.get(7) == 1)) {
				redWins();
			}else if ((boardList.get(2) == 1) && (boardList.get(5) == 1) && (boardList.get(8) == 1)) {
				redWins();
			}else if ((boardList.get(0) == 1) && (boardList.get(4) == 1) && (boardList.get(8) == 1)) {
				redWins();
			}else if ((boardList.get(6) == 1) && (boardList.get(4) == 1) && (boardList.get(2) == 1)) {
				redWins();
			}else if ((boardList.get(0) == 2) && (boardList.get(1) == 2) && (boardList.get(2) == 2)) {
				blueWins();
			}else if ((boardList.get(3) == 2) && (boardList.get(4) == 2) && (boardList.get(5) == 2)) {
				blueWins();
			}else if ((boardList.get(6) == 2) && (boardList.get(7) == 2) && (boardList.get(8) == 2)) {
				blueWins();
			}else if ((boardList.get(0) == 2) && (boardList.get(3) == 2) && (boardList.get(6) == 2)) {
				blueWins();
			}else if ((boardList.get(1) == 2) && (boardList.get(4) == 2) && (boardList.get(7) == 2)) {
				blueWins();
			}else if ((boardList.get(2) == 2) && (boardList.get(5) == 2) && (boardList.get(8) == 2)) {
				blueWins();
			}else if ((boardList.get(0) == 2) && (boardList.get(4) == 2) && (boardList.get(8) == 2)) {
				blueWins();
			}else if ((boardList.get(6) == 2) && (boardList.get(4) == 2) && (boardList.get(2) == 2)) {
				blueWins();
			}else {}
			}
		
	
	public static void redWins() {
		currentFrame.dispose();
		currentFrame = GUI.createRedWins();
	}
	
	public static void blueWins() {
		currentFrame.dispose();
		currentFrame = GUI.createBlueWins();
	}
	
	void errorMessage() {
		System.out.println("Error");
		
	}
}
