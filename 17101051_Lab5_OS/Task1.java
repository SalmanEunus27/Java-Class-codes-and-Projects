public class Task1 extends Thread{
    public void run(){
        System.out.println("The thread is running");
    }
        public static void main (String [] args){ 
            Task1 t1 = new Task1();
            t1.start(); 
    }
}