package exercise;

import java.io.File;
import java.util.Observable;

/*
 * 
 * Diese Klasse soll als Beipiel f�r die anderen Klassen dienen.
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
	 * Der FileChecker pr�ft wann auf eine Datei das letzte Mal zugegriffen wurde. 
	 * @param file Datei die gepr�ft werden soll
	 * @param lastModified letzter Zeitstempel oder 0
	 */
	public FileChecker(File file, long lastModified) {
		isRunning = true;
		this.file = file;
		timestamp = lastModified;
	}
	
	/**
	 * Wenn sich der Zeitstempel der Datei �ndert, informiert der FileChecker alle Observer und �bergibt die Datei.
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
				
				//informiere den Controller, dass die Datei neue Inhalte hat und �bergib dem Controller die Datei
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
	 * Diese Methode gibt den zuletzt ausgelesenen Zeitstempel der Datei zur�ck 
	 * @return Zeitstempel
	 */
	public long getTimestamp() {
		return timestamp;
	}
	
	/**
	 * Diese Methode die beobachtete Datei zur�ck 
	 * @return Datei
	 */
	public File getFile() {
		return file;
	}
}
