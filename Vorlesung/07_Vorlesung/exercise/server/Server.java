package exercise.server;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.ArrayList;

public class Server {

	private int numberOfConnections;
	private ArrayList<PrintWriter> connections; 
	private ArrayList<ClientInfo> clientInfos;
	private ServerSocket serverSocket;
	private int port;
	
	public Server(int port, int numberOfConnections) {
		this.numberOfConnections = numberOfConnections;
		this.port = port;
	}

	public void init() {
		connections = new ArrayList<>();
		clientInfos = new ArrayList<>();

		// TODO Erstell ein ServerSocket und horche auf oben �bergebenen Port und
		// erlaube die Anzahl der Verbindungen (numberOfConnections)

		// TODO warte auf eine Client Verbindung und erstell einen PrintWriter und einen Scanner
		// TODO f�ge den PrintWriter zur connections-ArrayList hinzu

		// TODO lies den Namen des Clients ein
		// TODO erstell eine Instanz von ClientInfo und f�ge diese ClientInfo der ArrayList clientInfos hinzu

		// TODO erstelle eine Instanz vom ServerReceiveThread und f�ge diesem der
		// clientInfo hinzu und starte den Thread

		// TODO Tipp: wenn sich mehrere Clients gleichzeitig verbinden k�nnen sollen, hilft dir:
		/*
		 * new Thread(new Runnable() {
		 * 
		 * @Override public void run() { // TODO frag hier Sachen wie den Namen ab...
		 * 
		 * } }).start();
		 * 
		 */

	}

	public void stop() {

		// TODO gehe einmal durch die Liste der clientInfos und stoppe alle Threads
		// TODO schlie�e das entsprechende Socket
	}

}
