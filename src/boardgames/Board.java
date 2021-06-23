package boardgames;

public class Board {
	
	//Defining rows, columns and pieces
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	//Constructor
	public Board(int rows, int columns) {
		if (rows<1 || columns <1) {
			throw new BoardException("Error creating board: There must be at least 1 row and 1 column!");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	//Getters only
	
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	//Return piece position
	public Piece piece(int row, int column) {
		if (!positionExists(row,column)) {
			throw new BoardException("Position not on the board!");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board!");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//Place pieces on Board
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already have a piece on position: " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	// Checking if the position exists
	private boolean positionExists(int row, int column) {
		return row >=0 && row<rows && column>=0 && column <columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	//Check if there is a piece
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board!");
		}
		return piece(position) != null;
	}
}
