package com.nanu.chess.gui;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.nanu.chess.board.Board;
import com.nanu.chess.board.Square;
import com.nanu.chess.support.Team;

@SuppressWarnings("serial")
public class BoardPanel extends JPanel {

	Board _board;
	Team _team;
	
	public BoardPanel (Board board) {
		_board = board;
		_team = Team.WHITE;
	}
	
	public void setTeam(Team team) {
		_team = team;
	}
	
	public void paintComponent(Graphics g) {
		ArrayList< ArrayList<Square> > grid = _board.getGrid();
		for ( int i = 0; i < 8; i++ ) {
			for ( int j = 0; j < 8; j++ ) {
				if ( ((i+j)%2 == 0 && _team.equals(Team.WHITE)) || ((i+j)%2 == 1 && _team.equals(Team.BLACK)) )
					g.setColor(GUIConstants.square.WHITE);
				if ( ((i+j)%2 == 0 && _team.equals(Team.BLACK)) || ((i+j)%2 == 1 && _team.equals(Team.WHITE)) )
					g.setColor(GUIConstants.square.BLACK);
			}
		}
	}
	
}
