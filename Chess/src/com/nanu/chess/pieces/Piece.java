package com.nanu.chess.pieces;

import java.util.ArrayList;

import com.nanu.chess.board.Board;
import com.nanu.chess.board.Square;
import com.nanu.chess.support.Team;

public abstract class Piece {

	protected Team _team;
	
	public Piece(Team team) {
		_team = team;
	}
	
	public abstract ArrayList<Square> getLegalMoves(Board b, Square s);
	
	public Team getTeam() {
		return _team;
	}
	
}
