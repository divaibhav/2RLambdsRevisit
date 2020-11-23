/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Nov-20
 *  Time: 11:30 AM
 */
package mutlithreadingusinglambda;

public class MyThreadMain {
    public static void main(String[] args) {
        //targeting Runnable interface for lambda expression
        Runnable runnable = ()->{
            for (int i = 0; i < 20 ; i++) {
                System.out.println("new thread");
            }
        };
        Thread t = new Thread(runnable);
        t.start();
        System.out.println("main done");

    }
}
