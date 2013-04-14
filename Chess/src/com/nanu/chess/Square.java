package com.nanu.chess;

public class Square {
	private int _x, _y;
	private Team _team;

	public Square(int x, int y) {
		_x = x;
		_y = y;
		_team = null;
	}
	
	public int getX() {
		return _x;
	}
	
	public int getY() {
		return _y;
	}
	
	public void setTeam(Team team) {
		_team = team;
	}
	
	public Team getTeam() {
		return _team;
	}

}
