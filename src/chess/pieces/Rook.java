package chess.pieces;

import boardgames.Board;
import boardgames.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		// Auxiliaries
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position pos = new Position(0, 0);

		// Movement - Above
		pos.setValues(position.getRow() - 1, position.getColumn());
		while (getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) {
			mat[pos.getRow()][pos.getColumn()] = true;
			pos.setRow(pos.getRow() - 1);
		}
		if (getBoard().positionExists(pos) && isThereOpponentPiece(pos)) {
			mat[pos.getRow()][pos.getColumn()] = true;
		}

		// Movement - Left
		pos.setValues(position.getRow(), position.getColumn() - 1);
		while (getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) {
			mat[pos.getRow()][pos.getColumn()] = true;
			pos.setColumn(pos.getColumn() - 1);
		}
		if (getBoard().positionExists(pos) && isThereOpponentPiece(pos)) {
			mat[pos.getRow()][pos.getColumn()] = true;
		}

		// Movement - Right
		pos.setValues(position.getRow(), position.getColumn() + 1);
		while (getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) {
			mat[pos.getRow()][pos.getColumn()] = true;
			pos.setColumn(pos.getColumn() + 1);
		}
		if (getBoard().positionExists(pos) && isThereOpponentPiece(pos)) {
			mat[pos.getRow()][pos.getColumn()] = true;
		}

		// Movement - Below
		pos.setValues(position.getRow() + 1, position.getColumn());
		while (getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) {
			mat[pos.getRow()][pos.getColumn()] = true;
			pos.setRow(pos.getRow() + 1);
		}
		if (getBoard().positionExists(pos) && isThereOpponentPiece(pos)) {
			mat[pos.getRow()][pos.getColumn()] = true;
		}

		return mat;
	}

}
