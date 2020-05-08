public class Main {
	public static void main(String[] args) {
        
		Q q = new Q();
		
		Producer pr= new Producer(q);
		Consumer co= new Consumer(q);
		
		//Printer printer = new Printer();
		
//		Student st1 = new Student("Hi",printer, "1");
//		Student st2 = new Student("Hello",printer,"2");
//		Student st3 = new Student("Yoo",printer,"3");
//		
//		try {
//			//newChild1.t.join();
//			//newChild2.t.join();
//			//newChild3.t.join();
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
		//System.out.println(newChild1.result+newChild2.result);
		
	}
}
