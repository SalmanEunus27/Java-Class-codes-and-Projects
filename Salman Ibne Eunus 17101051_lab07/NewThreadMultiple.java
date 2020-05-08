
public class NewThreadMultiple implements Runnable{
	Thread t;
	String name;
	public NewThreadMultiple(String name){
		t = new Thread(this, name);
		this.name = name;
		System.out.println("Child thread: " + name);
		t.start(); // Start the thread
	}

	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
			 System.out.println(name+" Child Thread: " + i);
			 Thread.sleep(1000);
		     }
		} catch (InterruptedException e) {
			System.out.println(name+ " Child interrupted.");
		}
		System.out.println(name + " Exiting child thread.");		
	}

	

}
