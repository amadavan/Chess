package com.nanu.chess.client;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Properties;

import javax.swing.*;

import com.nanu.chess.board.Board;
import com.nanu.chess.gui.BoardPanel;
import com.nanu.chess.gui.GUIConstants;

public class ClientRunner {
	
	Client _client;
	Board _board;
	BoardPanel _boardPanel;
	String _host;
	int _port;
	
	public ClientRunner() throws UnknownHostException, IOException {
		readProperties();
		initComponents();
		_client = new Client(_host,_port,_board,_boardPanel);
		_client.start();
	}

	private void readProperties() {
		Properties prop = new Properties();
		try {
    		prop.load(new FileInputStream("config.properties"));
    		_host = prop.getProperty("host");
    		_port = Integer.parseInt(prop.getProperty("port"));
		} catch (IOException e) {
			_host = "127.0.0.1";
			_port = 7000;
		} catch (NumberFormatException e) {
			_port = 7000;
		}
	}
	
	private void initComponents() {
		_board = new Board();
		_boardPanel = new BoardPanel(_board);
		
		JFrame frame = new JFrame();
		frame.setTitle("Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(GUIConstants.DISPLAY_WIDTH,GUIConstants.DISPLAY_HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		frame.add(_boardPanel);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		try {
			new ClientRunner();
		} catch (UnknownHostException e) {
			System.err.println("ClientRunner@main: don't know host");
		} catch (IOException e) {
			System.err.println("ClientRunner@main: can't connect to port");
		}
	}
}
