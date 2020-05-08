
public class Q {
	int n;
	boolean isValueSet = false;

	synchronized int get() {
		while (!isValueSet) {
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
		
		System.out.println("Got: " + n);
		notify();
		return n;
		
	}

	synchronized void put(int n) {
		while (isValueSet) {
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		this.n = n;

		System.out.println("Put: " + n);
        notify();
	}

}
