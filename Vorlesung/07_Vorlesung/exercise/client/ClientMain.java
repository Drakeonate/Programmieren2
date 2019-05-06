package exercise.client;

public class ClientMain {

	public static void main(String[] args) {
		
		/*
		 * Hier kannst du gerne die IP-Adresse und den Port ändern
		 */

		int port = 2653;
		String ip = "localhost";
		
		System.out.println("Starte den Client...");
		
		Controller controller = new Controller(ip, port);
		controller.init();
		
	}
	
}
