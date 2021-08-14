package thread;

public class ThreadDemo extends Thread {
	public ThreadDemo() {
		Thread t1 = new Thread(this, "Hii");
		t1.setPriority(MAX_PRIORITY);
		Thread t2 = new Thread(this, "Hello");
		t2.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();
	}

	public void run() {
		synchronized (this) {

			for (int i = 0; i < 3; i++) {
				Thread.yield();
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2=new ThreadDemo();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}

}
