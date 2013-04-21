package com.nanu.chess.server;

import java.io.IOException;
import java.net.Socket;

import com.nanu.chess.support.Connection;

public class ServerConnection extends Connection {

	public ServerConnection(Socket socket) throws IOException {
		super(socket);
	}

	public String sendAndReceive(String s) {
		out.println(s);
		String input = null;
		Boolean isNull = false;
		try {
			input = in.readLine();
			if ( input == null )
				isNull = true;
		} catch(IOException e) {
			isNull = true;
		}
		
		if (isNull) {
			synchronized (lock) {
				try {
					lock.wait();
					input = sendAndReceive(s);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		return input;
	}

	public void notifyLock() {
		synchronized(lock) { lock.notify(); }
	}
	
	private Object lock = new Object();
}
