package chess;

import boardgames.Board;
import boardgames.Piece;
import boardgames.Position;

public abstract class ChessPiece extends Piece {
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
	
	//Check if there is opponent piece
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
}
