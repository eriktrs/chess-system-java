package chess;

import boardgames.Position;

public class ChessPosition {
	private char column;
	private int row;
	
	//Constructors
	
	public ChessPosition(char column, int row) {
		//Check valid values
		if (column < 'a' || column > 'h' || row <1 || row >8) {
			throw new ChessException("Error instantiating Chess Position! Valid values are from A1 to H8.");
		}
		this.column = column;
		this.row = row;
	}
	
	//Getters only

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	//Converting ChessPosition to Position
	protected Position toPosition() {
		return new Position(8- row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}

	@Override
	public String toString() {
		//Forcing string concatenation
		return "" + column +  row;
	}
	
	
	
}
