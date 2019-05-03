package sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	
	public static void main(String[] args) {

		try {
			int port = 2222;
			//der Server akzeptiert gerade 100 Verbindungen zu Clients
			ServerSocket serverSocket = new ServerSocket(port, 100);
			
			Socket socket = serverSocket.accept();
			
			Scanner scanner = new Scanner(socket.getInputStream());
			String text = scanner.nextLine();
			System.out.println(text);
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println("Hello Moon");
			pw.flush();
			
			pw.close();
			scanner.close();
			socket.close();
			serverSocket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
