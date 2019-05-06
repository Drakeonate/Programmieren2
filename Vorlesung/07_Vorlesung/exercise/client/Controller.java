package exercise.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

import javax.swing.JOptionPane;


/*
 * 
 * Der Controller h�lt beim Client die F�den in der Hand und managed alles. Der Controller kennt die View und aktualisiert diese und bekommt mit wenn der User �ber die GUI eine Nachricht eintippt.
 * 
 * Zun�chst m�chte der Controller vom User den Chatnamen wissen, dies ist wichtig, denn nur wenn der Server den Namen des Users wei�, darf er losgelegen mit den chatten.
 *
 * Der Controller k�mmert sich darum, dass eine Netzwerkverbindung aufgebaut ist und startet einen Thread, damit er eintreffende Nachrichten empf�ngt.
 * 
 * �berall wo ihr was schreiben m�sst, steht wieder //TODO
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
				
				//TODO schreibe den msg-String �bers Netzwerk

			}
		});

		//TODO erstell das Socket und einen Writer mit dem man �ber das Socket schreiben kann

		
		clientReceiveThread = new ClientReceiveThread(socket, this);

		//TODO starte den ClientReceiveThread

		getUserName();

	}

	public void getUserName() {

		//frag den User nach dem Namen
		userName = JOptionPane.showInputDialog("Bitte gib deinen Namen ein:");
		
		//TODO schreibe den Namen �bers Netzwerk

		//setze den usernamen als Titel in der View
		view.setName(userName);

	}

	public void setMessage(String msg) {
		System.out.println(msg);
		view.addMessage(msg);
	}

}
