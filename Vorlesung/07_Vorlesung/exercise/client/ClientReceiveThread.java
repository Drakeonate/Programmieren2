package exercise.client;

import java.net.Socket;
import java.util.Scanner;

//TODO mache den ClientReceiveThread zum Thread
public class ClientReceiveThread { 

	private Socket socket;
	private Controller controller;
	private boolean isRunning;

	public ClientReceiveThread(Socket socket, Controller controller) {
		this.socket = socket;
		this.controller = controller;
		isRunning = true;
	}

	//TODO überschreibe die run()-Methode 
	//TODO und empfange dort Nachrichten mit Hilfe des Reaeders deiner Wahl
	//TODO wenn du eine Nachricht bekommen hast, übermittel dem Controller diese Nachricht, damit er diese an die GUI weitergeben kann. 
	//Das machst du mit: controller.setMessage("Hier sollte die empfangene Message stehen");
	
	// ACHTUNG: Wenn du deinen Reader schließt mit .close(), dann schließt du damit evtl auch das Socket. Also schließe den Reader nur, wenn du das Programm beenden möchtest!
	
	
	

	public void stopThread() {
		isRunning = false;
	}
}
