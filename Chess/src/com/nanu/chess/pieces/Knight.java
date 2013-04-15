package com.nanu.chess.pieces;

import java.util.ArrayList;

import com.nanu.chess.board.Board;
import com.nanu.chess.board.Square;

public class Knight extends Piece {

	public ArrayList<Square> getLegalMoves(Board b) {
		ArrayList<Square> moves = new ArrayList<Square> ();
		Square temp;
		for ( int i = -2; i <= 2; i++ ) {
			for ( int j = -2; j <= 2; j++ ) {
				if ( i != 0 && j != 0 && i != j && b.isValid(j, i) ) {
					temp = b.getSquare(j,i);
					if ( temp != null ) {
						if ( temp.getTeam() == null )
							moves.add(temp);
						else if ( !temp.getTeam().equals(_team) ) {
							moves.add(temp);
						}
					}
				}
			}
		}
		return moves;
	}

}
