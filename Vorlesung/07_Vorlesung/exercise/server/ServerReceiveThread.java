package exercise.server;

import java.io.PrintWriter;
import java.util.ArrayList;

public class ServerReceiveThread extends Thread {

	private boolean isRunning;
	private ArrayList<PrintWriter> connections;
	private ClientInfo clientInfo;
	
	public ServerReceiveThread(ArrayList<PrintWriter> connections, ClientInfo clientInfo) {
		isRunning = true;
		this.connections = connections;
		this.clientInfo = clientInfo;
	}


	//TODO überschreibe die run()-Methode
	//TODO und empfange dort Nachrichten mit Hilfe des Reaeders in ClientInfo
	//TODO wenn du eine Nachricht empfangen hast, musst du den Namen des Clients vorne an die Nachricht setzen. Der Name steht auch in ClientInfo
	//TODO rufe die Methode sendMsg2Clients(message) auf, um die Nachricht an alle Clients zu senden
	//TODO entferne den Printwriter aus der liste und setze isRunning aus false, falls ein Fehler auftritt. 
	//Dann wird an diesen Client kleine Nachricht mehr geschickt und es wird nicht mehr versucht eine Nachricht zu empfangen
	//TODO Achtung der Zugriff auf die ArrayList connections muss threadsaft sein!

	
	public void stopThread() {
		isRunning = false;
	}
	
	private void sendMsg2Clients(String message) {
		
		//TODO schicke an alle Clients die Nachricht mit Hilfe der ArrayList connections
		//TODO Achtung : die PrintWriter nicht schließen!
		//TODO der Zugriff auf die ArrayList muss threadsafe sein!
		
	}
	
}
