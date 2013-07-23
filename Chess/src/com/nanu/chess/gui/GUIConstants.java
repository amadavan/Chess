package com.nanu.chess.gui;

import java.awt.Color;

import javax.swing.ImageIcon;

import com.nanu.chess.pieces.*;
import com.nanu.chess.support.Team;

public class GUIConstants {
	public static final int MENUBAR_HEIGHT	= 16;
	public static final int DISPLAY_WIDTH	= 600;
	public static final int DISPLAY_HEIGHT	= 600+MENUBAR_HEIGHT;
	
	public static final int BOARD_WIDTH		= DISPLAY_WIDTH;
	public static final int BOARD_HEIGHT	= DISPLAY_HEIGHT-MENUBAR_HEIGHT;
	public static final int PADDING			= 10;
	public static final int SQUARE_WIDTH	= (BOARD_WIDTH -2*PADDING)/8;
	public static final int SQUARE_HEIGHT	= (BOARD_HEIGHT-2*PADDING)/8;
	
	public static class square {
		public static final Color BLACK		= new Color(150,150,150);
		public static final Color WHITE		= new Color(50,50,50);
	}
	
	public static class piece {
		private static final String ROOT			= "/com/nanu/chess/gui/icons/";
		public static final ImageIcon WHITE_PAWN	= new ImageIcon(GUIConstants.class.getResource(ROOT+"white_pawn.png"));
		public static final ImageIcon WHITE_BISHOP	= new ImageIcon(GUIConstants.class.getResource(ROOT+"white_bishop.png"));
		public static final ImageIcon WHITE_KNIGHT	= new ImageIcon(GUIConstants.class.getResource(ROOT+"white_knight.png"));
		public static final ImageIcon WHITE_ROOK	= new ImageIcon(GUIConstants.class.getResource(ROOT+"white_rook.png"));
		public static final ImageIcon WHITE_QUEEN	= new ImageIcon(GUIConstants.class.getResource(ROOT+"white_queen.png"));
		public static final ImageIcon WHITE_KING	= new ImageIcon(GUIConstants.class.getResource(ROOT+"white_king.png"));

		public static final ImageIcon BLACK_PAWN	= new ImageIcon(GUIConstants.class.getResource(ROOT+"black_pawn.png"));
		public static final ImageIcon BLACK_BISHOP	= new ImageIcon(GUIConstants.class.getResource(ROOT+"black_bishop.png"));
		public static final ImageIcon BLACK_KNIGHT	= new ImageIcon(GUIConstants.class.getResource(ROOT+"black_knight.png"));
		public static final ImageIcon BLACK_ROOK	= new ImageIcon(GUIConstants.class.getResource(ROOT+"black_rook.png"));
		public static final ImageIcon BLACK_QUEEN	= new ImageIcon(GUIConstants.class.getResource(ROOT+"black_queen.png"));
		public static final ImageIcon BLACK_KING	= new ImageIcon(GUIConstants.class.getResource(ROOT+"black_king.png"));
		
		public static final int ICON_WIDTH			= WHITE_PAWN.getIconWidth();
		public static final int ICON_HEIGHT			= WHITE_PAWN.getIconHeight();
		
		public static ImageIcon getIcon(Piece p) {
			if ( p instanceof Pawn ) {
				if ( p.getTeam().equals(Team.WHITE) ) 
					return WHITE_PAWN;
				else
					return BLACK_PAWN;
			}
			if ( p instanceof Knight ) {
				if ( p.getTeam().equals(Team.WHITE) )
					return WHITE_KNIGHT;
				else
					return BLACK_KNIGHT;
			}
			if ( p instanceof Bishop ) {
				if ( p.getTeam().equals(Team.WHITE) )
					return WHITE_BISHOP;
				else
					return BLACK_BISHOP;
			}
			if ( p instanceof Rook ) {
				if ( p.getTeam().equals(Team.WHITE) )
					return WHITE_ROOK;
				else
					return BLACK_ROOK;
			}
			if ( p instanceof Queen ) {
				if ( p.getTeam().equals(Team.WHITE) )
					return WHITE_QUEEN;
				else
					return BLACK_QUEEN;
			}
			if ( p instanceof King ) {
				if ( p.getTeam().equals(Team.WHITE) )
					return WHITE_KING;
				else
					return BLACK_KING;
			}
			return null;
		}
	}
}
