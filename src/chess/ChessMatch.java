package chess;

import boardgames.Board;
import boardgames.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		//Setup the Chess Game
		board = new Board(8,8);
		initialSetup();
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
	
	//Testing first setup
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(0,7));
		board.placePiece(new King(board, Color.WHITE), new Position(0,4));
	}
}
