package exercise.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

import javax.swing.JOptionPane;


/*
 * 
 * Der Controller hält beim Client die Fäden in der Hand und managed alles. Der Controller kennt die View und aktualisiert diese und bekommt mit wenn der User über die GUI eine Nachricht eintippt.
 * 
 * Zunächst möchte der Controller vom User den Chatnamen wissen, dies ist wichtig, denn nur wenn der Server den Namen des Users weiß, darf er losgelegen mit den chatten.
 *
 * Der Controller kümmert sich darum, dass eine Netzwerkverbindung aufgebaut ist und startet einen Thread, damit er eintreffende Nachrichten empfängt.
 * 
 * Überall wo ihr was schreiben müsst, steht wieder //TODO
 * 
 */

public class Controller {

	private int port;
	private Socket socket;
	private String serverIP;
	private ClientReceiveThread clientReceiveThread;
	private String userName = "Unknown";
	private ClientGUI view;
	
	//TODO deklariere einen Writer deiner Wahl!

	public Controller(String serverIP, int port) {
		this.port = port;
		this.serverIP = serverIP;

	}

	public void init() {
		view = new ClientGUI();
		view.setListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String msg = view.getUserInput();

				view.clearField();
				
				//TODO schreibe den msg-String übers Netzwerk

			}
		});

		//TODO erstell das Socket und einen Writer mit dem man über das Socket schreiben kann

		
		clientReceiveThread = new ClientReceiveThread(socket, this);

		//TODO starte den ClientReceiveThread

		getUserName();

	}

	public void getUserName() {

		//frag den User nach dem Namen
		userName = JOptionPane.showInputDialog("Bitte gib deinen Namen ein:");
		
		//TODO schreibe den Namen übers Netzwerk

		//setze den usernamen als Titel in der View
		view.setName(userName);

	}

	public void setMessage(String msg) {
		System.out.println(msg);
		view.addMessage(msg);
	}

}
