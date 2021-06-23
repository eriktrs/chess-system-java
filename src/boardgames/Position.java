package boardgames;

public class Position {
	
	//Defining row and column 
	private int row;
	private int column;
	
	
	//Constructors
	public Position() {
	}
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	//Getters and Setters

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	//Printing the position on screen
	@Override
	public String toString() {
		return row + "," +column;
	}
	
	
	
	
	
	
	

}
