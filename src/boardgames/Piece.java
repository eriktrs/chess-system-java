package boardgames;

public abstract class Piece {

	protected Position position;
	private Board board;

	// Constructor
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// Getter only
	protected Board getBoard() {
		return board;
	}

	// Possible Piece Movement
	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	// Check if is possible any movement
	public boolean isThereAnyPossibleMove() {
		// Auxiliary matrix
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				// If there any possible movement
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
