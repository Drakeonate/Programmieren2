package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		try {
			
			int port = 2222;
			//ip address and port
			Socket socket = new Socket("192.168.32.2", port);
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println("Hello World");
			pw.flush();
			
			//Scanner in = new Scanner(socket.getInputStream())
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String text = br.readLine();
			
			System.out.println(text);
			
			br.close();
			pw.close();
			socket.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
