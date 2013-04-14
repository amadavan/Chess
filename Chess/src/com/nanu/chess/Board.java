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
				temp.add(new Square(i,j));
			}
			grid.add(temp);
		}
	}

}
