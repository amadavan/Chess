package com.nanu.chess;

import java.util.ArrayList;

public class Queen extends Piece {

	public ArrayList<Square> getLegalMoves(Board b) {
		ArrayList<Square> moves = new ArrayList<Square> ();
		for ( int i = 0; i < 8; i++ )
			getDiagonalMoves(b, i, moves);
		return moves;
	}
	
	private void getDiagonalMoves(Board b, int direction, ArrayList<Square> moves) {
		Square temp = _square;
		while ( true ) {
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
				if ( !temp.hasPiece() )
					moves.add(temp);
				else if ( temp.getOwner() != _team ) {
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
