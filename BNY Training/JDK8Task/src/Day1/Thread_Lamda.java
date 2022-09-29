package Day1;

public class Thread_Lamda {
	/*
	 * Q.8 With the help of lambda expression implements multithreading. Two threads
	 * simultaneously work on a resource which is going to be
	 */
	
	public static void main(String[] args) {

		// First Thread Demo

		Runnable thread1 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Value Of I Is " + i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t = new Thread(thread1);
		t.setName("Devendra");
		t.start();

		Runnable thread2 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i * 2);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t2=new Thread(thread2);
		t2.setName("TableTh");
		t2.start();
	}

	
}
