package com.nanu.chess.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

public class ChessServer extends Thread {
	
	private ServerSocket _serverSocket;
	
	public ChessServer(int port) throws IOException {
		_serverSocket = new ServerSocket(port);
		System.out
				.println("ChessServer@constructor: ServerSocket initialized.");
	}
	
	@Override
	public void run() {
		try {
			System.out
					.println("ChessServer@run: ServerSocket accepting clients.");

			while (true) {
				ArrayList<ServerConnection> players = new ArrayList<ServerConnection>();
				for (int i = 0; i < 2; i++)
					players.add(new ServerConnection(_serverSocket.accept()));
				System.out
						.println("ChessServer@run: Starting ChessThread.");
				new ChessThread(players);
			}
		} catch (IOException e) {
			System.out.println("ChessThread@run: " + e.toString());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		if (args.length != 1)
			System.out.println("Usage: java BridgeServer port");
		else {
			try {
				new ChessServer(Integer.parseInt(args[0])).start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
