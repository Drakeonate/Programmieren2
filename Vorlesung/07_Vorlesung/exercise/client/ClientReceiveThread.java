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

	//TODO �berschreibe die run()-Methode 
	//TODO und empfange dort Nachrichten mit Hilfe des Reaeders deiner Wahl
	//TODO wenn du eine Nachricht bekommen hast, �bermittel dem Controller diese Nachricht, damit er diese an die GUI weitergeben kann. 
	//Das machst du mit: controller.setMessage("Hier sollte die empfangene Message stehen");
	
	// ACHTUNG: Wenn du deinen Reader schlie�t mit .close(), dann schlie�t du damit evtl auch das Socket. Also schlie�e den Reader nur, wenn du das Programm beenden m�chtest!
	
	
	

	public void stopThread() {
		isRunning = false;
	}
}
