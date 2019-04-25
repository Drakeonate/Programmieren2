package exercise;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Observable;
import java.util.Scanner;

public class WetherChecker extends Observable implements Runnable {

	private static final String WETHER_URL = "http://api.openweathermap.org/data/2.5/weather?id=2911298&units=metric&appid=bc0cf1e927643900351d6e599712c574";
	private URL url;
	
	public WetherChecker() {
		try {
			url = new URL(WETHER_URL);			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		
		String data = getWetherData();



	}
	
	/*
	 * So sieht der json String aus
	 * 
	 * {"coord": {"lon":10,"lat":53.55}, "weather":[{ "id":800, "main":"Clear",
	 * "description":"clear sky", "icon":"01d"}], "base":"stations", "main":{
	 * "temp":294.59, "pressure":1009, "humidity":37, "temp_min":292.59,
	 * "temp_max":297.04}, "visibility":10000, "wind":{ "speed":6.7, "deg":170},
	 * "clouds":{"all":0}, "dt":1556195824,
	 * "sys":{"type":1,"id":1263,"message":0.0086,"country":"DE","sunrise":
	 * 1556164704,"sunset":1556217440}, "id":2911298, "name":"Hamburg", "cod":200}
	 * 
	 * 
	 */

	public String getWetherData() {
		
		String json = "";
		try {
			
			// TODO Achtung Bitte maximal einmal pro Minute abfragen
			// TODO Falls du hier kein String bekommst, dann leg dir einen Account bei
			// openweathermap an und
			// TODO ersetze die ID durch deine appid=<Hier kommt deine ID> s.o.
			// Hintergrund es sind nur 60 Aufrufe pro Sekunde zugelassen, falls nur einer
			// aus dem Kurs querschiesst, kann es Probleme geben
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();

			Scanner in = new Scanner(connection.getInputStream());
			
			json = in.nextLine();
			
			in.close();
//			System.out.println(json);


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return json;

	}
	

}
