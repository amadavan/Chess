package com.nanu.chess.pieces;

import java.util.ArrayList;

import com.nanu.chess.board.Board;
import com.nanu.chess.board.Square;
import com.nanu.chess.support.Team;

public class Bishop extends Piece {

	public Bishop(Team team) {
		super(team);
	}

	public ArrayList<Square> getLegalMoves(Board b, Square s) {
		ArrayList<Square> moves = new ArrayList<Square> ();
		for ( int i = 0; i < 4; i++ )
			getDiagonalMoves(b, s, i, moves);
		return moves;
	}
	
	private void getDiagonalMoves(Board b, Square s, int direction, ArrayList<Square> moves) {
		Square temp = s;
		while ( true ) {
			switch(direction) {
				case (0): temp = b.getNE(temp); break;
				case (1): temp = b.getNW(temp); break;
				case (2): temp = b.getSE(temp); break;
				case (3): temp = b.getSW(temp); break;
			}
			if ( temp != null ) {
				if ( temp.getPiece() == null )
					moves.add(temp);
				else if ( !temp.getPiece().getTeam().equals(_team) ) {
					moves.add(temp);
					break;
				}
				else
					break;
			}
			else
				break;
		}
	}

}
