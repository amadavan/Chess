package com.nanu.chess;

import java.util.ArrayList;

public class Rook extends Piece {

	public ArrayList<Square> getLegalMoves(Board b) {
		ArrayList<Square> moves = new ArrayList<Square> ();
		for ( int i = 0; i < 4; i++ )
			getMoves(b, i, moves);
		return moves;
	}
	
	private void getMoves(Board b, int direction, ArrayList<Square> moves) {
		Square temp = _square;
		while(true) {
			switch(direction) {
				case (0): temp = b.getE(temp); break;
				case (1): temp = b.getW(temp); break;
				case (2): temp = b.getS(temp); break;
				case (3): temp = b.getN(temp); break;
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
