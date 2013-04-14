package com.nanu.chess;

public class Square {
	private int _x, _y;
	private boolean _hasPiece;
	private int _owner;

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
	
	public void setPiece(boolean hasPiece, int owner) {
		_hasPiece = hasPiece;
		_owner = owner;
	}
	
	public boolean hasPiece() {
		return _hasPiece;
	}
	
	public int getOwner() {
		return _owner;
	}

}
