package com.nanu.chess.pieces;

import java.util.ArrayList;

import com.nanu.chess.board.Board;
import com.nanu.chess.board.Square;
import com.nanu.chess.support.Team;

public class Bishop extends Piece {

	public Bishop(Team team, Square square) {
		super(team, square);
	}

	public ArrayList<Square> getLegalMoves(Board b) {
		ArrayList<Square> moves = new ArrayList<Square> ();
		for ( int i = 0; i < 4; i++ )
			getDiagonalMoves(b, i, moves);
		return moves;
	}
	
	private void getDiagonalMoves(Board b, int direction, ArrayList<Square> moves) {
		Square temp = _square;
		while ( true ) {
			switch(direction) {
				case (0): temp = b.getNE(temp); break;
				case (1): temp = b.getNW(temp); break;
				case (2): temp = b.getSE(temp); break;
				case (3): temp = b.getSW(temp); break;
			}
			if ( temp != null ) {
				if ( temp.getTeam() == null )
					moves.add(temp);
				else if ( !temp.getTeam().equals(_team) ) {
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
