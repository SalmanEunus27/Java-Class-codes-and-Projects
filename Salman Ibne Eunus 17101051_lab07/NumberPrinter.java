
public class NumberPrinter implements Runnable{
	Thread t;
	public int result = 0;
        int start=0,end = 0;
	NumberPrinter(int s, int e){
		
		t= new Thread(this);
		t.start();
                start = s;
                end = e;
	}

	public void run() {
		for(int i=start;i<=end;i++){
			result = result + i;
		}
		
	}

	
	

}
