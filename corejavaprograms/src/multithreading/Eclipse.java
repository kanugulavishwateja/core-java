package multithreading;

public class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse"+Thread.currentThread().getId());
	}

}