package serviceClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class IOService {

	public static void write(String text, String filename) {
		
		write(text, filename, false);
	}
	
	public static void write(String text, String filename, boolean append) {
		
		try (FileWriter fw = new FileWriter(filename, append)) {
			
			fw.write(text + "\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String read(String filename) {
		
		return read(new File(filename));
	}
	
	public static String read(File file) {
		
		String text = "";
		try {
			Scanner in = new Scanner(file);
			
			while(in.hasNextLine()) {
				text += in.nextLine() + "\n";
			}
			
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return text;
	}
	
	public static void writeObject(String filename, Object object) {
	
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(object);
			
			oos.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Object readObject(String filename) {
		
		Object object = null;
		
		try {
			
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			object = ois.readObject();
			
			ois.close();
			fis.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return object;
		
	}
}
