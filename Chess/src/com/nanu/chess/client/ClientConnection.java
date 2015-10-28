package com.nanu.chess.client;

import java.io.IOException;
import java.net.Socket;

import com.nanu.chess.support.Connection;

public class ClientConnection extends Connection {

	public ClientConnection(Socket socket) throws IOException {
		super(socket);
	}


	public String receive() {
		String s = null;
		try {
			s = in.readLine();
		} catch(IOException e) {}
		return s;
	}

}
