package com.nanu.chess.server;

import java.util.ArrayList;

import com.nanu.chess.support.Command;
import com.nanu.chess.support.Team;

public class ChessThread extends Thread {

	private ArrayList<ServerConnection> _players;
	
	public ChessThread(ArrayList<ServerConnection> players) {
		_players = players;
		start();
	}
	
	@Override
	public void run() {
		send(0, Command.RESET, "WHITE");
		send(1, Command.RESET, "BLACK");
		sendAndReceive(0, Command.GETMOVE, "");
	}
	
	public void send(int player, Command command, String parameters) {
		_players.get(player).send(command+":"+parameters);
	}
	public String sendAndReceive(int player, Command command, String parameters) {
		return _players.get(player).sendAndReceive(command+":"+parameters);
	}
	
}
