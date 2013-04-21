package com.nanu.chess.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.nanu.chess.board.Board;
import com.nanu.chess.support.Command;

public class Client extends Thread {
	
	private ClientConnection _connection;
	private Board _board;
	
	public Client(Socket socket) throws IOException {
		_connection = new ClientConnection(socket);
	}
	
	public Client(String host, int port) throws UnknownHostException, IOException {
		Socket _socket = new Socket(host, port);
		_connection = new ClientConnection(_socket);
	}
	
	private void movePiece(String move) {
		String[] move_square = move.split(",");
		_board.movePiece(
				_board.getSquare(move_square[0].trim().charAt(0)-'0', move_square[0].trim().charAt(1)-'0'),
				_board.getSquare(move_square[1].trim().charAt(0)-'0', move_square[1].trim().charAt(1)-'0'));
	}
	
	private String getMove() {
		return "";
	}
	
	public void parseCommand(String s) {
		int loc = s.indexOf(":");
		Command c;
		String params = "";
		if ( loc != -1 ) {
			c = Command.valueOf(s.substring(0,loc));
			params = s.substring(loc+1);
		} else {
			c = Command.valueOf(s);
		}
		switch(c) {
			case MOVE: movePiece(params);
			case GETMOVE: getMove();
				break;
		}
	}
	
	@Override
	public void run() {
		String s;
		if ( (s = _connection.receive()) != null )
			parseCommand(s);
	}
	
}
