package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyReader {

	public static void main(String[] args) {
		
		//we want to access the file text.txt
		//this file must exist, if it does not exist we will get an exception
		File file = new File("text.txt");
		
		try {
			//read with a buffered reader from file. So we can read a complete line from file
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			//read first line
			String line = br.readLine();
			
			//readLine returns null when end of file is reached
			//so we have to check if we reach end of file
			while(line != null) {
				
				//we print every line on the console
				System.out.println(line);
				line = br.readLine();
			}
			
			//never forget to close the streams
			br.close();
			fr.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
