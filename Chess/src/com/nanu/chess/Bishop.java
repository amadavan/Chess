package com.nanu.chess;

import java.util.ArrayList;

public class Bishop extends Piece {

	public ArrayList<Square> getLegalMoves(Board b) {
		ArrayList<Square> moves = new ArrayList<Square> ();
		for ( int i = 0; i < 4; i++ )
			getDiagonalMoves(b, moves, i);
		return moves;
	}
	
	private void getDiagonalMoves(Board b, ArrayList<Square> moves, int direction) {
		Square temp = _square;
		while ( true ) {
			switch(direction) {
				case (0): temp = b.getNE(temp); break;
				case (1): temp = b.getNW(temp); break;
				case (2): temp = b.getSE(temp); break;
				case (3): temp = b.getSW(temp); break;
			}
			if ( temp != null ) {
				moves.add(temp);
				if ( temp.hasPiece() )
					break;
			}
			else
				break;
		}
	}

}
