package multithreading;

public class Notepad extends Thread{
	public void run() {
		System.out.println("Notepad"+Thread.currentThread().getId());
	}

}
