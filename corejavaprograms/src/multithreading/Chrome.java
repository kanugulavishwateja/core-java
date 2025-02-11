package multithreading;

public class Chrome extends Thread{
	public void run() {
		System.out.println("Chrome "+Thread.currentThread().getId());
	}

}
