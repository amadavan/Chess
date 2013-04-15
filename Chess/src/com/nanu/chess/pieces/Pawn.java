package com.nanu.chess.pieces;

import java.util.ArrayList;

import com.nanu.chess.board.Board;
import com.nanu.chess.board.Square;

public class Pawn extends Piece {
	
	public ArrayList<Square> getLegalMoves(Board b) {
		// TODO Auto-generated method stub
		Square temp = _square;
		ArrayList<Square> moves = new ArrayList<Square>();
		if(temp.getY() == 2 && b.getN(b.getN(temp)).hasPiece() == false) {
			moves.add(b.getN(b.getN(temp)));
		}
		if(b.getNE(temp).getOwner() != temp.getOwner() || b.getNW(temp).getOwner() != temp.getOwner()) {
			moves.add(b.getNE(temp));
			moves.add(b.getNW(temp));
		}
		if(b.getN(temp) != null) {
			if(temp.getY() == 2 && !b.getN(b.getN(temp)).hasPiece() && !b.getN(temp).hasPiece()) {
				moves.add(b.getN(b.getN(temp)));
				moves.add(b.getN(temp));
			}
			else if(!b.getN(temp).hasPiece()) {
				moves.add(b.getN(temp));
			}
		}	
			
		return moves;
	}

}
