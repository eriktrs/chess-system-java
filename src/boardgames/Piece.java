package boardgames;

public class Piece {
	
	protected Position position;
	private Board board;
	
	//Constructor
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	//Getter only
	protected Board getBoard() {
		return board;
	}

	
	

}
