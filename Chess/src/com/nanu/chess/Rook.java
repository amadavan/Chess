package com.nanu.chess;

import java.util.ArrayList;

public class Rook extends Piece {

	public ArrayList<Square> getLegalMoves(Board b) {
		// TODO Auto-generated method stub
		
		ArrayList<Square> moves = new ArrayList<Square>();
		Square temp = this._square;
		while(b.getE(temp) != null) {
			moves.add(temp);
			temp = b.getE(temp);
		}
		while(b.getW(temp) != null) {
			moves.add(temp);
			temp = b.getW(temp);
		}
		while(b.getN(temp) != null) {
			moves.add(temp);
			temp = b.getN(temp);
		}
		while(b.getS(temp) != null) {
			moves.add(temp);
			temp = b.getS(temp);
		}
		
		return null;
	}


}
