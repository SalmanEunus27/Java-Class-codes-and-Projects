
public class NumberPrinterSecond implements Runnable{
	
	

	Thread t;
	public int result = 0;
	NumberPrinterSecond(){
		
		t= new Thread(this);
		t.start();
	}

	public void run() {
		for(int i=51;i<=100;i++){
			result = result + i;
		}
		
	}

	

}
