package threads;

public class MyThreadMain {
	
	public static void main(String[] args) {
		MyTimeThread timeThread = new MyTimeThread();
		Thread thread = new Thread(timeThread);
		thread.start();
		
		
	}

}
