package com.nanu.chess.gui;

import java.awt.Color;

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
		public static final Color BLACK		= new Color(255,255,255);
		public static final Color WHITE		= new Color(0,0,0);
	}
}
