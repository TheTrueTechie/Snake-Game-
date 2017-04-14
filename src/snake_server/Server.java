package snake_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private Socket mainSocket;
	private ServerSocket listener;

	private static final int PORT = 1738;

	private BufferedReader in;
	private PrintWriter out;

	public static void main(String[] args) {
		Server a = new Server();

	}

	Server() {

		try {
			listener = new ServerSocket(PORT);
			System.err.println("Connection to " + PORT + " is successful!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public class Handler {
		public void run() {

			try {

				// Create character streams for the socket.
				in = new BufferedReader(new InputStreamReader(mainSocket.getInputStream()));
				out = new PrintWriter(mainSocket.getOutputStream(), true);
			} catch (IOException e) {
				System.err.println("Checkpoint 1");
			}
		}
	}

}
