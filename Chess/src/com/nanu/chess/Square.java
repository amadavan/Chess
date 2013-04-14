package com.nanu.chess;

public class Square {
	private int _x, _y;
	private boolean _hasPiece;

	public Square(int x, int y) {
		_x = x;
		_y = y;
		_hasPiece = false;
	}
	
	public int getX() {
		return _x;
	}
	
	public int getY() {
		return _y;
	}
	
	public void setPiece(boolean hasPiece) {
		_hasPiece = hasPiece;
	}
	
	public boolean hasPiece() {
		return _hasPiece;
	}

}
