package exercise.server;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientInfo {

	
	/*
	 * Finger weg von dieser Klasse, es sei denn du weiﬂt was du tust ;)
	 */
	
	private Socket socket;
	private ServerReceiveThread thread;
	private Scanner in;
	private PrintWriter out;
	private String name;
	
	public ClientInfo(Socket socket, Scanner in, PrintWriter out, String name) {
		super();
		this.socket = socket;
		this.in = in;
		this.out = out;
		this.name = name;
	}

	public Socket getSocket() {
		return socket;
	}

	public ServerReceiveThread getThread() {
		return thread;
	}

	public Scanner getIn() {
		return in;
	}

	public PrintWriter getOut() {
		return out;
	}

	public String getName() {
		return name;
	}

	public void setThread(ServerReceiveThread serverReceiveThread) {
		this.thread = serverReceiveThread;
	}
	
}
