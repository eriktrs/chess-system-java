package chess;

import boardgames.Board;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		//Setup the Chess Game
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces(){
		//Creating auxiliary variable
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i =0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				//Downcasting 
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}
