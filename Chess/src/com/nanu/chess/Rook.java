package com.nanu.chess;

import java.util.ArrayList;

public class Rook extends Piece {

	public ArrayList<Square> getLegalMoves(Board b) {
		// TODO Auto-generated method stub
		
		ArrayList<Square> _moves = new ArrayList<Square>();
		Square _temp = this._square;
		while(b.getE(_temp) != null) {
			_moves.add(_temp);
			_temp = b.getE(_temp);
		}
		while(b.getW(_temp) != null) {
			_moves.add(_temp);
			_temp = b.getW(_temp);
		}
		while(b.getN(_temp) != null) {
			_moves.add(_temp);
			_temp = b.getN(_temp);
		}
		while(b.getS(_temp) != null) {
			_moves.add(_temp);
			_temp = b.getS(_temp);
		}
		
		return null;
	}


}
