package com.nanu.chess;

import java.util.ArrayList;

public abstract class Piece {
	
	protected Square _square;
	protected int _team;
	
	public abstract ArrayList<Square> getLegalMoves(Board b);
	
	public Square getSquare() {
		return _square;
	}
	
	public void setSquare(Square square) {
		_square = square;
	}
}
