package com.nanu.chess.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.nanu.chess.board.Board;
import com.nanu.chess.gui.BoardPanel;
import com.nanu.chess.support.Command;
import com.nanu.chess.support.Team;

public class Client extends Thread {
	
	private ClientConnection _connection;
	private BoardPanel _boardPanel;
	private Board _board;

	
	public Client(String host, int port, Board board, BoardPanel boardPanel) throws UnknownHostException, IOException {
		Socket _socket = new Socket(host, port);
		_connection = new ClientConnection(_socket);
		_board = board;
		_boardPanel = boardPanel;
	}
	
	private void movePiece(String move) {
		String[] move_square = move.split(",");
		_board.movePiece(
				_board.getSquare(move_square[0].trim().charAt(0)-'0', move_square[0].trim().charAt(1)-'0'),
				_board.getSquare(move_square[1].trim().charAt(0)-'0', move_square[1].trim().charAt(1)-'0')
		);
		_boardPanel.repaint();
	}
	
	private String getMove() {
		return _boardPanel.getMove();
	}
	
	private void reset(String teamParam) {
		Team team = Team.valueOf(teamParam);
		_board.resetGrid(team);
		_boardPanel.setTeam(team);
	}
	
	public void parseCommand(String s) {
		int loc = s.indexOf(":");
		Command c;
		String params = "";
		if ( loc != -1 ) {
			c = Command.valueOf(s.substring(0,loc));
			params = s.substring(loc+1).trim();
		} else {
			c = Command.valueOf(s);
		}
		switch(c) {
			case MOVE: movePiece(params);
			case GETMOVE: _connection.send(getMove());
				break;
			case RESET: reset(params);
				break;
		}
	}
	
	@Override
	public void run() {
		String s;
		while (true)
			if ( (s = _connection.receive()) != null )
				parseCommand(s);
	}
	
}
