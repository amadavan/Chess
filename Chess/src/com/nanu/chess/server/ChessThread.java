package com.nanu.chess.server;

import java.util.ArrayList;

public class ChessThread extends Thread {

	private ArrayList<ServerConnection> _players;
	
	public ChessThread(ArrayList<ServerConnection> players) {
		_players = players;
	}
	
	@Override
	public void run() {
		
	}
	
}
