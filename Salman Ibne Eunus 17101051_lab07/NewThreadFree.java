
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
  *
public class NewThreadFree {

    NewThreadFree() {

        

        //System.out.println("Child mathod ");
        start(); // Start the thread
    }

    // This is the entry point for the second thread.
    public void start() {
        run();
    }

    public void run() {

        try {
            for (int i = 6; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(NewThreadFree.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Exiting child .");
    }

}
