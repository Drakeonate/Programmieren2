package threads;

import java.util.Calendar;
import java.util.Observable;

public class MyTimeThread extends Observable implements Runnable {

	private boolean isRunning = true;
	
	@Override
	public void run() {

		while(isRunning) {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String time = Calendar.getInstance().getTime().toString();
			setChanged();
			notifyObservers(time);
			
			System.out.println(time);

		}		
	}
	
	public void stopThread() {
		isRunning = false;
	}

}
