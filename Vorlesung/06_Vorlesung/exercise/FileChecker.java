package exercise;

import java.io.File;
import java.util.Observable;

/*
 * 
 * Diese Klasse soll als Beipiel für die anderen Klassen dienen.
 * 
 * 
 * 
 * 
 */


public class FileChecker extends Observable implements Runnable {
	
	private long timestamp = 0L;
	private boolean isRunning = false;
	private File file;
	
	/**
	 * Der FileChecker prüft wann auf eine Datei das letzte Mal zugegriffen wurde. 
	 * @param file Datei die geprüft werden soll
	 * @param lastModified letzter Zeitstempel oder 0
	 */
	public FileChecker(File file, long lastModified) {
		isRunning = true;
		this.file = file;
		timestamp = lastModified;
	}
	
	/**
	 * Wenn sich der Zeitstempel der Datei ändert, informiert der FileChecker alle Observer und übergibt die Datei.
	 */
	@Override
	public void run() {

		
		while(isRunning) {

			try {
				//wache alle 500 ms auf
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//hol dir den Zeitstempel an und vergleich ihn mit dem Zeitstempel oben
			//wenn auf die Datei zugegriffen wurde, unterscheiden sich die Zeitstempel
			long tmp = file.lastModified();
			if(tmp != timestamp) {
				timestamp = tmp;
				
				//informiere den Controller, dass die Datei neue Inhalte hat und übergib dem Controller die Datei
				setChanged();
				notifyObservers(file);
				
			} 
			
			
		}
	}
	
	

	/**
	 * Diese Methode beendet den FileChecker
	 */
	public void stopChecker() {
		isRunning = false;
	}

	/**
	 * Diese Methode gibt den zuletzt ausgelesenen Zeitstempel der Datei zurück 
	 * @return Zeitstempel
	 */
	public long getTimestamp() {
		return timestamp;
	}
	
	/**
	 * Diese Methode die beobachtete Datei zurück 
	 * @return Datei
	 */
	public File getFile() {
		return file;
	}
}
