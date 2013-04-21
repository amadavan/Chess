package com.nanu.chess.board;

import com.nanu.chess.pieces.Piece;

public class Square {
	private int _x, _y;
	private Piece _piece;

	public Square(int x, int y) {
		_x = x;
		_y = y;
		_piece = null;
	}
	
	public int getX() {
		return _x;
	}
	
	public int getY() {
		return _y;
	}
	
	public void setPiece(Piece piece) {
		_piece = piece;
	}
	
	public Piece getPiece() {
		return _piece;
	}
	
	public String toString() {
		return _x+""+_y;
	}

}
