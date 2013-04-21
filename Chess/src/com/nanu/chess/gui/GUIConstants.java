package com.nanu.chess.gui;

import java.awt.Color;

public class GUIConstants {
	public static final int DISPLAY_WIDTH	= 800;
	public static final int DISPLAY_HEIGHT	= 800;
	
	public static final int PADDING		= 10;
	public static final int SQUARE_WIDTH	= (DISPLAY_WIDTH -2*PADDING)/8;
	public static final int SQUARE_HEIGHT	= (DISPLAY_HEIGHT-2*PADDING)/8;
	
	public static class square {
		public static final Color BLACK		= new Color(255,255,255);
		public static final Color WHITE		= new Color(0,0,0);
	}
}
