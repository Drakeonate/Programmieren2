package fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import exceptions.Building;

public class MyWriter {

	public static void main(String[] args) {
		
		//we want to access the file text.txt
		//this file do not have to exist, it would be created if it does not exist because we are writing!
		String path = "text.txt";
		File file = new File(path);

		//code to write some lines in file with PrintWriter
//		try (FileWriter fw = new FileWriter(file, true);
//				PrintWriter pw = new PrintWriter(fw)){
//			
//			pw.println("Hallo ich bin ein Text");
//			//The printwriter formats string, int aso like a tabel if you want
//			//2 Vorkommastellen		%2.f
//			//4 Nachkommastellen	%.4f
//			pw.format("%2.4f %3d %3d", 68.743953, 12345, 4);
//
//		
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		//now we want to write whole objects like a building with an objectOutoutStream.
		//but building has to implement the interface Serializable, so it could be written.
		Building building = new Building();
		building.setFlying(true);
		building.setSize(100);
		building.setPurpose("Umgedrehte Pyramide");
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(building);
			
			oos.close();
			fos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
