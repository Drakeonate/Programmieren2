package exercise.server;

import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		
		/*
		 * Hier kannst du gerne die Anzahl der zugelassenen Client-Verbindungen und den Port ändern
		 */

		
		System.out.println("Starte Server...");
		int port = 2653;
		Server server = new Server(port, 100);
		server.init();

		System.out.println("Bitte drück die anykey-Taste zum Beenden.");
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		System.out.println(input);
		scanner.close();
		
		server.stop();
		
		
	}
	
}
