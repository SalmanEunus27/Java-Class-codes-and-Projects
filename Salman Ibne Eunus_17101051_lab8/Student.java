
public class Student implements Runnable{
	String msg;
	Printer printer;
	Thread t;
	public int result = 0;
        int start=0,end = 0;
        Student(String s, Printer p, String name){
		printer=p;
		msg=s;
		t= new Thread(this);
		t.start();

	}

	public void run() {
		System.out.println("123");
		System.out.println("456");
		//printer.printMyMessage(msg);
        synchronized(printer) {
        	printer.printMyMessage(msg);
        }
		
	}

	
	

}
