package multithreading;          

public class Eclip implements Runnable{
	
	public void run() {
		System.out.println("Eclip "+ Thread.currentThread().getId());
	}
}
