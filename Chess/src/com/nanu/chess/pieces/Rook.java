package com.nanu.chess.pieces;

import java.util.ArrayList;

import com.nanu.chess.board.Board;
import com.nanu.chess.board.Square;
import com.nanu.chess.support.Team;

public class Rook extends Piece {

	public Rook(Team team) {
		super(team);
	}

	public ArrayList<Square> getLegalMoves(Board b, Square s) {
		ArrayList<Square> moves = new ArrayList<Square> ();
		for ( int i = 0; i < 4; i++ )
			getMoves(b, s, i, moves);
		return moves;
	}
	
	private void getMoves(Board b, Square s, int direction, ArrayList<Square> moves) {
		Square temp = s;
		while(true) {
			switch(direction) {
				case (0): temp = b.getE(temp); break;
				case (1): temp = b.getW(temp); break;
				case (2): temp = b.getS(temp); break;
				case (3): temp = b.getN(temp); break;
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
