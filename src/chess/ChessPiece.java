package chess;

import boardgames.Board;
import boardgames.Piece;

public class ChessPiece extends Piece {
	//Defining Chess Piece Colors
	private Color color;

	//Constructor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//Getter only
	public Color getColor() {
		return color;
	}
	
}
