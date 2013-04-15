package com.nanu.chess.pieces;

import java.util.ArrayList;

import com.nanu.chess.board.Board;
import com.nanu.chess.board.Square;
import com.nanu.chess.support.Team;

public abstract class Piece {
	
	protected Square _square;
	protected Team _team;
	
	public abstract ArrayList<Square> getLegalMoves(Board b);
	
	public Square getSquare() {
		return _square;
	}
	
	public void setSquare(Square square) {
		_square = square;
	}
}
