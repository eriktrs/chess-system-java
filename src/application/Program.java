package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		// Testing - Printing board - First attempt
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
