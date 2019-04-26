package exercise;

import java.util.Scanner;

import serviceClass.IOService;


public class SyncTool {

	
	public static void main(String[] args) {
		
		/*
		 * 
		 * Bitte hier nichts ver‰ndern !
		 * Es sei denn du weiﬂt was du tust!
		 * 
		 */
		
		Controller controller = new Controller();
		controller.init();
		
		
		Scanner scanner = new Scanner(System.in);
		
		boolean isRunning = true;

		while(isRunning) {
		
			System.out.println("Gib eine Message ein:");
			String msg = scanner.nextLine();
			if(msg.equals("Q") || msg.equals("q")) {
				isRunning = false;
				controller.stop();
			}
			else {
				IOService.write(msg, "Message.txt", true);
			}
		}	
		
		scanner.close();
		
		
	}
}
