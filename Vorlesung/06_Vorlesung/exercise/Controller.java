package exercise;

import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import fileIO.service.IOService;

public class Controller implements Observer {
	

	private static final String FILE_CHECKER_DATA_FILE = "FileCheckerDataFile.txt";
	private FileChecker fileChecker;
	private WetherChecker wetherChecker;
	private TimeChecker timeChecker;
	private NewsFrame newsFrame = new NewsFrame();
	
	public Controller() {
	}

	public void init() {
		
		//TODO init methoden einkommentieren, wenn ihr soweit seid
		
//		initTimeChecker();
//		initWetherChecker();
		initFileChecker();
	}
	
	private void initTimeChecker() {

		//TODO initialisiere den TimeChecker
		
		timeChecker.addObserver(this);
		//TODO lass den TimeChecker als Thread laufen und starte ihn
		
	}
	
	
	private void initWetherChecker() {
		//TODO initialisiere den WetherChecker
		
		wetherChecker.addObserver(this);
		//TODO lass den WetherChecker als Thread laufen und starte ihn

	}
	
	private void initFileChecker() {
		
		/*
		 * Bitte in dieser Methode nichts ‰ndern !
		 * Es sei denn du weiﬂt was du tust!
		 */

		
		//check if file exists
		File file = new File(FILE_CHECKER_DATA_FILE);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//read filename and timestamp from file 
		String readData = IOService.read(file);
		String[] data = readData != null && readData != ""? readData.split(";") : new String[2];
		
		
		//check if file exists, if it does not exist a file names Message.txt is created
		File fcFile = new File((data[0] != null && data[0] != "")? data[0] : "Message.txt");

		if(!fcFile.exists()) {
			try {
				fcFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		long timestamp = 0L;

		//try set timestamp from file
		if(data != null && data[1] != null && data[1] != "") {

			try {
				timestamp = Long.valueOf(data[1].replaceAll("\\s", ""));				
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
		fileChecker = new FileChecker(fcFile, timestamp);
		
		fileChecker.addObserver(this);
		
		Thread t = new Thread(fileChecker);
		t.start();

	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		/*
		 * Bitte in dieser Methode nichts ‰ndern !
		 * Es sei denn du weiﬂt was du tust!
		 */
		
		if(o instanceof FileChecker && arg instanceof File) {
			File file = (File) arg;
			newsFrame.setMessages(IOService.read(file).split("\n"));
		}
		
		else if(o instanceof WetherChecker) {
			if(arg instanceof String) {
				String description = (String) arg;
				newsFrame.setWetherDescription(description);
			}
			if(arg instanceof Float) {
				Float temp = (Float) arg;
				newsFrame.setTemperature(String.valueOf(temp));
			}
		}
		
		else if(o instanceof TimeChecker && arg instanceof String) {
			String time = (String) arg;
			newsFrame.setTime(time);
		}
		
	}

		
	
	public void stop() {
		//TODO alle Threads beenden
		
		fileChecker.stopChecker();
		IOService.write(FILE_CHECKER_DATA_FILE, fileChecker.getFile().getAbsolutePath() + ";" + fileChecker.getTimestamp(), false);
		
	}
}
