package com.nanu.chess.pieces;

import java.util.ArrayList;

import com.nanu.chess.board.Board;
import com.nanu.chess.board.Square;
import com.nanu.chess.support.Team;

public class King extends Piece {

	public King(Team team) {
		super(team);
	}

	public ArrayList<Square> getLegalMoves(Board b, Square s) {
		ArrayList<Square> moves = new ArrayList<Square> ();
		for ( int i = 0; i < 8; i++ )
			getMoves(b, s, i, moves);
		return moves;
	}
	
	private void getMoves(Board b, Square s, int direction, ArrayList<Square> moves) {
		Square temp = s;
		switch(direction) {
			case (0): temp = b.getN(temp); break;
			case (1): temp = b.getNE(temp); break;
			case (2): temp = b.getE(temp); break;
			case (3): temp = b.getSE(temp); break;
			case (4): temp = b.getS(temp); break;
			case (5): temp = b.getSW(temp); break;
			case (6): temp = b.getW(temp); break;
			case (7): temp = b.getNW(temp); break;
		}
		if ( temp != null ) {
			if ( temp.getPiece() == null )
				moves.add(temp);
			else if ( !temp.getPiece().getTeam().equals(_team) )
				moves.add(temp);
		}
	}

}
