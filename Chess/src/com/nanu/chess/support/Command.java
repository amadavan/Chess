package com.nanu.chess.support;

public enum Command {
	MOVE,		// Sends the other player's move (Square moveFrom, Square moveTo)
	GETMOVE,	// Asks for another move ()
	RESET;		// Resets the board (Team)
}
