package com.nanu.chess.pieces;

import java.util.ArrayList;

import com.nanu.chess.board.Board;
import com.nanu.chess.board.Square;
import com.nanu.chess.support.Team;

public abstract class Piece {

	protected Team _team;
	protected Square _square;
	
	public Piece(Team team, Square square) {
		_team = team;
		_square = square;
	}
	
	public abstract ArrayList<Square> getLegalMoves(Board b);
	
	public Square getSquare() {
		return _square;
	}
	
	public void setSquare(Square square) {
		_square = square;
	}
	
	public boolean move(Board b, Square square) {
		if ( getLegalMoves(b).contains(square) ) {
			_square = square;
			return true;
		}
		return false;
	}
	
}
