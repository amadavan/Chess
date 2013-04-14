package com.nanu.chess;

import java.util.ArrayList;

public abstract class Piece {
	
	protected Square _square;
	
	public abstract ArrayList<Square> getLegalMoves(ArrayList<ArrayList<Square>> grid);
	
	public Square getSquare() {
		return _square;
	}
	
	public void setSquare(Square square) {
		_square = square;
	}
}
