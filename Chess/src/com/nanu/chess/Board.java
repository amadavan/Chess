package com.nanu.chess;

import java.util.ArrayList;

public class Board {
	
	private ArrayList< ArrayList<Square> > grid;
	
	public Board() {
		grid = new ArrayList< ArrayList<Square> > ();
		ArrayList<Square> temp;
		for ( int i = 0; i < 7; i++ ) {
			temp = new ArrayList<Square> ();
			for ( int j = 0; j < 7; j++ ) {
				temp.add(new Square(j,i));
			}
			grid.add(temp);
		}
	}
	
	public Square getN(Square s) {
		if ( grid.size() > s.getY() + 1 )
			return grid.get(s.getY() + 1).get(s.getX());
		else
			return null;
	}
	
	public Square getNE(Square s) {
		if ( grid.size() > s.getY() + 1 && grid.get(0).size() > s.getX() + 1 )
			return grid.get(s.getY() + 1).get(s.getX() + 1);
		else
			return null;
	}
	
	public Square getE(Square s) {
		if ( grid.get(0).size() > s.getX() + 1 )
			return grid.get(s.getY()).get(s.getX());
		else
			return null;
	}
	
	public Square getSE(Square s) {
		if ( 0 <= s.getY() - 1 && grid.get(0).size() > s.getX() + 1 )
			return grid.get(s.getY() - 1).get(s.getX() + 1);
		else
			return null;
	}
	
	public Square getS(Square s) {
		if ( 0 <= s.getY() - 1 )
			return grid.get(s.getY() - 1).get(s.getX());
		else
			return null;
	}
	
	public Square getSW(Square s) {
		if ( 0 <= s.getY() - 1 && 0 <= s.getX() - 1 )
			return grid.get(s.getY() - 1).get(s.getX() - 1);
		else
			return null;
	}
	
	public Square getW(Square s) {
		if ( 0 <= s.getX() - 1 )
			return grid.get(s.getY()).get(s.getX() - 1);
		else
			return null;
	}
	
	public Square getNW(Square s) {
		if ( grid.size() > s.getY() + 1 && 0 <= s.getX() - 1 )
			return grid.get(s.getY() + 1).get(s.getX() - 1);
		else
			return null;
	}

}
